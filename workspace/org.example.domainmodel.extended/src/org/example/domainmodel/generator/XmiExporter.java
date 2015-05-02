package org.example.domainmodel.generator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class XmiExporter {
	public static CharSequence exportToXMI(EObject resource) {
		XMIResourceFactoryImpl resFactory = new XMIResourceFactoryImpl();
		XMIResource xmiresource = (XMIResource) resFactory.createResource(URI.createFileURI("output.xmi"));		
		xmiresource.getContents().add(EcoreUtil.copy(resource));
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			xmiresource.save(baos, new HashMap());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return baos.toString();
	}
}