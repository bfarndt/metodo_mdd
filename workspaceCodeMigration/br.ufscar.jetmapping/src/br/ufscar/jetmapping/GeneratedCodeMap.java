package br.ufscar.jetmapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCodeMap {
	List<MapEntry> map;

	public GeneratedCodeMap() {
		map = new ArrayList<MapEntry>();
	}

	public void addMapEntry(MapEntry mapEntry) {
		map.add(mapEntry);
	}

	public MapEntry getLastMapEntryOnTemplateFile(String templateFile) {
		if (map.isEmpty())
			return null;
		for (int i = map.size() - 1; i >= 0; i--) {
			MapEntry me = map.get(i);
			if (me.getTemplateFile().equals(templateFile))
				return me;
		}
		return null;
	}

	public MapEntry getLastMapEntry() {
		if (map.isEmpty())
			return null;
		return map.get(map.size() - 1);
	}

	private void simplifyMapping() {
		if (map.size() > 1) {
			for (int i = 0; i < map.size() - 1; i++) {
				MapEntry me = map.get(i);
				MapEntry me2 = map.get(i + 1);
				if (me.canMerge(me2)) {
					me.merge(me2);
					map.remove(i + 1);
					i--;
				}
			}
		}
	}

	public void saveToWriter(PrintWriter out) throws IOException {
		simplifyMapping();
		for (MapEntry me : map) {
			out.println(me.toString());
			out.flush();
		}
	}

	public void updateMapEntries(String generatedFile) {
		for (MapEntry me : map) {
			me.setGeneratedFile(generatedFile);
		}
	}

	public boolean isGeneratedFile(String generatedFile) {
		for (MapEntry me : map) {
			if (me.getGeneratedFile().equals(generatedFile)) {
				return true;
			}
		}
		return false;
	}

	public boolean isTemplateFile(String templateFile) {
		for (MapEntry me : map) {
			if (me.getTemplateFile().equals(templateFile)) {
				return true;
			}
		}
		return false;
	}

	public List<String> getAssociatedTemplates(String generatedFile) {
		List<String> result = new ArrayList<String>();
		for (MapEntry me : map) {
			if (me.getGeneratedFile().equals(generatedFile)
					&& !result.contains(me.getTemplateFile())) {
				result.add(me.getTemplateFile());
			}
		}
		return result;
	}

	public List<String> getGeneratedFiles(String templateFile) {
		List<String> result = new ArrayList<String>();
		for (MapEntry me : map) {
			if (me.getTemplateFile().equals(templateFile)
					&& !result.contains(me.getGeneratedFile())) {
				result.add(me.getGeneratedFile());
			}
		}
		return result;
	}

	public MapEntry getAssociatedTemplate(String generatedFile, int offset,
			RetrievalPolicy policy) {
		for (MapEntry me : map) {
			if (me.getGeneratedFile().equals(generatedFile)
					&& me.getGeneratedFileSection().contains(offset, policy)) {
				return me;
			}
		}
		return null;
	}

	public MapEntry getAssociatedGeneratedFile(String templateFile, int offset,
			RetrievalPolicy policy) {
		for (MapEntry me : map) {
			if (me.getTemplateFile().equals(templateFile)
					&& me.getTemplateFileSection().contains(offset, policy)) {
				return me;
			}
		}
		return null;
	}

	public List<MapEntry> getMap() {
		return map;
	}

	public static GeneratedCodeMap createFromFile(File f) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(f));
		GeneratedCodeMap gcm = new GeneratedCodeMap();
		String line = br.readLine();
		while (line != null) {
			MapEntry me = MapEntry.parseMapEntry(line);
			gcm.addMapEntry(me);
			line = br.readLine();
		}
		br.close();
		return gcm;
	}

	public void insertedText(String generatedFile, int generatedFileOffset,
			String templateFile, int templateFileOffset, String text,
			int length, RetrievalPolicy policy) {
		if (generatedFile != null) {
			for (MapEntry me : map) {
				if (me.getGeneratedFile().equals(generatedFile)
						&& me.getGeneratedFileSection().isAfter(
								generatedFileOffset, policy)) {
					me.getGeneratedFileSection().translateRange(length);
				}
			}
		}

		if (templateFile != null) {
			for (MapEntry me : map) {
				if (me.getTemplateFile().equals(templateFile)
						&& me.getTemplateFileSection().isAfter(
								templateFileOffset, policy)) {
					me.getTemplateFileSection().translateRange(length);
				}
			}
		}
	}

	public void splitInGeneratedFile(MapEntry me, int offset, int length,
			RetrievalPolicy policy) {
		for (int i = 0; i < map.size(); i++) {
			if (map.get(i).equals(me)
					&& map.get(i).getGeneratedFileSection()
							.contains(offset, policy)) {
				MapEntry oldMapEntry = map.get(i);
				MapEntry newMapEntry = oldMapEntry.createCopy();
				int translatedOffset = oldMapEntry
						.translateGeneratedFileToTemplate(offset);

				if (length > 0) {
					oldMapEntry.getGeneratedFileSection().setTo(offset);
					newMapEntry.getGeneratedFileSection().setFrom(
							offset + length);
					oldMapEntry.getTemplateFileSection()
							.setTo(translatedOffset);
					newMapEntry.getTemplateFileSection().setFrom(
							translatedOffset + length);
				} else {
					oldMapEntry.getGeneratedFileSection().setTo(offset);
					newMapEntry.getGeneratedFileSection().setFrom(offset);
					oldMapEntry.getTemplateFileSection()
							.setTo(translatedOffset);
					newMapEntry.getTemplateFileSection().setFrom(
							translatedOffset);
				}

				if (!newMapEntry.hasZeroLength()) {
					map.add(i + 1, newMapEntry);
				}

				if (oldMapEntry.hasZeroLength()) {
					map.remove(i);
				}

				return;
			}
		}
	}

	public void splitInTemplateFile(MapEntry me, int offset, int length,
			RetrievalPolicy policy) {
		for (int i = 0; i < map.size(); i++) {
			if (map.get(i).getTemplateFile().equals(me.getTemplateFile())
					&& map.get(i).getTemplateFileSection()
							.contains(offset, policy)) {

				MapEntry oldMapEntry = map.get(i);
				MapEntry newMapEntry = oldMapEntry.createCopy();
				int translatedOffset = oldMapEntry
						.translateTemplateToGeneratedFile(offset);

				if (length > 0) {
					oldMapEntry.getTemplateFileSection().setTo(offset);
					newMapEntry.getTemplateFileSection().setFrom(
							offset + length);
					oldMapEntry.getGeneratedFileSection().setTo(
							translatedOffset);
					newMapEntry.getGeneratedFileSection().setFrom(
							translatedOffset + length);
				} else {

					oldMapEntry.getTemplateFileSection().setTo(offset);
					newMapEntry.getTemplateFileSection().setFrom(offset);
					oldMapEntry.getGeneratedFileSection().setTo(
							translatedOffset);
					newMapEntry.getGeneratedFileSection().setFrom(
							translatedOffset);
				}

				if (!newMapEntry.hasZeroLength()) {
					map.add(i + 1, newMapEntry);
				}

				if (oldMapEntry.hasZeroLength()) {
					map.remove(i);
				}
			}
		}
	}

	public List<MapEntry> getAllSimilarEntriesInTemplateFile(
			String templateFile, int from, int to) {
		List<MapEntry> ret = new ArrayList<>();
		for (MapEntry me : map) {
			if (me.getTemplateFile().equals(templateFile)
					&& me.getTemplateFileSection().getFrom() == from
					&& me.getTemplateFileSection().getTo() == to) {
				ret.add(me);
			}
		}
		return ret;
	}

}
