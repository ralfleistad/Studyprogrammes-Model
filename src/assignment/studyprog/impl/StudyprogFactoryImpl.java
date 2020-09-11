/**
 */
package assignment.studyprog.impl;

import assignment.studyprog.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StudyprogFactoryImpl extends EFactoryImpl implements StudyprogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StudyprogFactory init() {
		try {
			StudyprogFactory theStudyprogFactory = (StudyprogFactory)EPackage.Registry.INSTANCE.getEFactory(StudyprogPackage.eNS_URI);
			if (theStudyprogFactory != null) {
				return theStudyprogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StudyprogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StudyprogPackage.FACULTY: return createFaculty();
			case StudyprogPackage.PROGRAMME: return createProgramme();
			case StudyprogPackage.SPECIALIZATION: return createSpecialization();
			case StudyprogPackage.SEMESTER: return createSemester();
			case StudyprogPackage.MANDATORY_COURSE: return createMandatoryCourse();
			case StudyprogPackage.ELECTIVE_COURSE: return createElectiveCourse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Faculty createFaculty() {
		FacultyImpl faculty = new FacultyImpl();
		return faculty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programme createProgramme() {
		ProgrammeImpl programme = new ProgrammeImpl();
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization createSpecialization() {
		SpecializationImpl specialization = new SpecializationImpl();
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semester createSemester() {
		SemesterImpl semester = new SemesterImpl();
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryCourse createMandatoryCourse() {
		MandatoryCourseImpl mandatoryCourse = new MandatoryCourseImpl();
		return mandatoryCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectiveCourse createElectiveCourse() {
		ElectiveCourseImpl electiveCourse = new ElectiveCourseImpl();
		return electiveCourse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyprogPackage getStudyprogPackage() {
		return (StudyprogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StudyprogPackage getPackage() {
		return StudyprogPackage.eINSTANCE;
	}

} //StudyprogFactoryImpl
