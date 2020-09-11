package assignment.studyprog.example;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import assignment.studyprog.StudyprogPackage;

public class Example {

	public static void main(String[] args) {
		
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(StudyprogPackage.eNS_URI, StudyprogPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("Faculty.xmi").toString()), true);
		
		TreeIterator<EObject> allContents = resource.getAllContents();
		while(allContents.hasNext()) {
			EObject eObj = allContents.next();
			System.out.println(eObj);
		}

	}

}
