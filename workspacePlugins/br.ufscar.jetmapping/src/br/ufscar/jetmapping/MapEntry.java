package br.ufscar.jetmapping;

import java.util.StringTokenizer;

public class MapEntry {
	private String templateFile;
	private Range templateFileSection;

	private String generatedFile;
	private Range generatedFileSection;

	private String type;

	private String warning;

	// private String content;

	public MapEntry(String templateFile, Range templateFileSection,
			String generatedFile, Range generatedFileSection, String type,
			String warning) {
		super();
		this.templateFile = templateFile == null ? "null" : templateFile;
		this.templateFileSection = templateFileSection;
		this.generatedFile = generatedFile == null ? "null" : generatedFile;
		this.generatedFileSection = generatedFileSection;
		this.type = type == null ? "null" : type;
		this.warning = warning == null ? "null" : warning;
		// this.content = content;
	}

	public void setGeneratedFile(String generatedFile) {
		this.generatedFile = generatedFile;
	}

	public boolean canMerge(MapEntry other) {
		return this.type.equals(other.type)
				&& this.generatedFile.equals(other.generatedFile)
				&& this.templateFile.equals(other.templateFile)
				&& this.generatedFileSection
						.isContiguous(other.generatedFileSection)
				&& this.templateFileSection
						.isContiguous(other.templateFileSection);
	}

	public int translateGeneratedFileToTemplate(int offset) {
		int relativeOffset = offset - generatedFileSection.getFrom();
		int ret = templateFileSection.getFrom() + relativeOffset;
		if (ret > templateFileSection.getTo() - 1)
			ret = templateFileSection.getTo() - 1;
		if (ret < templateFileSection.getFrom())
			ret = templateFileSection.getFrom();
		return ret;
	}

	public int translateTemplateToGeneratedFile(int offset) {
		int relativeOffset = offset - templateFileSection.getFrom();
		int ret = generatedFileSection.getFrom() + relativeOffset;
		if (ret > generatedFileSection.getTo() - 1)
			ret = generatedFileSection.getTo() - 1;
		if (ret < generatedFileSection.getFrom())
			ret = generatedFileSection.getFrom();
		return ret;
	}

	public void merge(MapEntry other) {
		generatedFileSection.merge(other.generatedFileSection);
		templateFileSection.merge(other.templateFileSection);
	}

	public String toString() {
		return templateFile + ":" + templateFileSection + ":" + generatedFile
				+ ":" + generatedFileSection + ":" + type + ":" + warning;// +
																			// ":"
																			// +
																			// content;
	}

	public static MapEntry parseMapEntry(String str) {
		StringTokenizer st = new StringTokenizer(str, ":");
		String strTemplateFile = st.nextToken();
		String strTemplateFileSection = st.nextToken();
		String strGeneratedFile = st.nextToken();
		String strGeneratedFileSection = st.nextToken();
		String strType = st.nextToken();
		String strWarning = st.nextToken();
		// String strContent = st.nextToken();
		strGeneratedFile = strGeneratedFile.equals("null") ? null
				: strGeneratedFile;
		return new MapEntry(strTemplateFile,
				Range.parseRange(strTemplateFileSection), strGeneratedFile,
				Range.parseRange(strGeneratedFileSection), strType, strWarning);

	}

	public String getTemplateFile() {
		return templateFile;
	}

	public String getGeneratedFile() {
		return generatedFile;
	}

	public Range getTemplateFileSection() {
		return templateFileSection;
	}

	public Range getGeneratedFileSection() {
		return generatedFileSection;
	}

	public String getType() {
		return type;
	}

	public void setType(String t) {
		this.type = t;
	}

	public String getWarning() {
		return warning;
	}

	public MapEntry createCopy() {
		return new MapEntry(templateFile, templateFileSection.createCopy(),
				generatedFile, generatedFileSection.createCopy(), type, warning);
	}

	public boolean hasZeroLength() {
		return templateFileSection.hasZeroLength()
				&& generatedFileSection.hasZeroLength();

	}
}
