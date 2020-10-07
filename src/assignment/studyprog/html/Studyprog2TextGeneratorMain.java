package assignment.studyprog.html;


import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import assignment.studyprog.Faculty;
import assignment.studyprog.StudyprogPackage;
import assignment.studyprog.example.Example;
import assignment.studyprog.impl.StudyprogFactoryImpl;


public class Studyprog2TextGeneratorMain {
	
	public static void main(String[] args) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogPackage.eNS_URI, StudyprogPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("Faculty.xmi").toString()), true);
		
		Faculty fac = null;
		for (EObject eObj : resource.getContents()) {
			if(eObj instanceof Faculty) {
				fac = (Faculty) eObj;
			}
		}
		
		String html = new Studyprog2TextGenerator().generateHTML(fac);
		System.out.println(html);
	}

	/*
	public static void main(String[] args) throws IOException {
		
		Faculty fac = getFaculty("../model/Faculty.xmi");
		String html = new Studyprog2TextGenerator().generateHTML(fac);
		URI target = URI.createURI(args[1]);
		try (PrintStream ps = new PrintStream(fac.eResource().getResourceSet().getURIConverter().createOutputStream(target))) {
			ps.print(html);
		}
	}
	
	
	public static Faculty getFaculty(String uriString) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogPackage.eNS_URI, StudyprogPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("studyprog", new StudyprogFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(uriString), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Faculty) {
				return (Faculty) eObject;
			}
		}
		return null;
	}
*/

}
