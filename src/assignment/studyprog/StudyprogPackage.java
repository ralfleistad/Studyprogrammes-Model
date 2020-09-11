/**
 */
package assignment.studyprog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignment.studyprog.StudyprogFactory
 * @model kind="package"
 * @generated
 */
public interface StudyprogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "studyprog";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/assignment.studyprog.model/model/studyprog.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "studyprog";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StudyprogPackage eINSTANCE = assignment.studyprog.impl.StudyprogPackageImpl.init();

	/**
	 * The meta object id for the '{@link assignment.studyprog.impl.FacultyImpl <em>Faculty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.studyprog.impl.FacultyImpl
	 * @see assignment.studyprog.impl.StudyprogPackageImpl#getFaculty()
	 * @generated
	 */
	int FACULTY = 0;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY__PROGRAMMES = 0;

	/**
	 * The number of structural features of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Faculty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACULTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.studyprog.impl.ProgrammeImpl <em>Programme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.studyprog.impl.ProgrammeImpl
	 * @see assignment.studyprog.impl.StudyprogPackageImpl#getProgramme()
	 * @generated
	 */
	int PROGRAMME = 1;

	/**
	 * The feature id for the '<em><b>Programme Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__PROGRAMME_NAME = 0;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SPECIALIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__SEMESTERS = 2;

	/**
	 * The feature id for the '<em><b>Needed Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME__NEEDED_CREDITS = 3;

	/**
	 * The number of structural features of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Programme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.studyprog.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.studyprog.impl.SpecializationImpl
	 * @see assignment.studyprog.impl.StudyprogPackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Specialization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SPECIALIZATIONS = 1;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTERS = 2;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.studyprog.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.studyprog.impl.SemesterImpl
	 * @see assignment.studyprog.impl.StudyprogPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__MANDATORY = 0;

	/**
	 * The feature id for the '<em><b>Elective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ELECTIVE = 1;

	/**
	 * The feature id for the '<em><b>Semester Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEMESTER_NUM = 2;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.studyprog.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.studyprog.impl.CourseImpl
	 * @see assignment.studyprog.impl.StudyprogPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 4;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CODE = 1;

	/**
	 * The feature id for the '<em><b>Course Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_CREDIT = 2;

	/**
	 * The feature id for the '<em><b>Course Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Course Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE_GROUP = 4;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment.studyprog.impl.MandatoryCourseImpl <em>Mandatory Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.studyprog.impl.MandatoryCourseImpl
	 * @see assignment.studyprog.impl.StudyprogPackageImpl#getMandatoryCourse()
	 * @generated
	 */
	int MANDATORY_COURSE = 5;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__COURSE_NAME = COURSE__COURSE_NAME;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__COURSE_CODE = COURSE__COURSE_CODE;

	/**
	 * The feature id for the '<em><b>Course Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__COURSE_CREDIT = COURSE__COURSE_CREDIT;

	/**
	 * The feature id for the '<em><b>Course Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__COURSE_DESCRIPTION = COURSE__COURSE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Course Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE__COURSE_GROUP = COURSE__COURSE_GROUP;

	/**
	 * The number of structural features of the '<em>Mandatory Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_FEATURE_COUNT = COURSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mandatory Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_COURSE_OPERATION_COUNT = COURSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment.studyprog.impl.ElectiveCourseImpl <em>Elective Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment.studyprog.impl.ElectiveCourseImpl
	 * @see assignment.studyprog.impl.StudyprogPackageImpl#getElectiveCourse()
	 * @generated
	 */
	int ELECTIVE_COURSE = 6;

	/**
	 * The feature id for the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE__COURSE_NAME = COURSE__COURSE_NAME;

	/**
	 * The feature id for the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE__COURSE_CODE = COURSE__COURSE_CODE;

	/**
	 * The feature id for the '<em><b>Course Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE__COURSE_CREDIT = COURSE__COURSE_CREDIT;

	/**
	 * The feature id for the '<em><b>Course Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE__COURSE_DESCRIPTION = COURSE__COURSE_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Course Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE__COURSE_GROUP = COURSE__COURSE_GROUP;

	/**
	 * The number of structural features of the '<em>Elective Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_FEATURE_COUNT = COURSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Elective Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSE_OPERATION_COUNT = COURSE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link assignment.studyprog.Faculty <em>Faculty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Faculty</em>'.
	 * @see assignment.studyprog.Faculty
	 * @generated
	 */
	EClass getFaculty();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.studyprog.Faculty#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see assignment.studyprog.Faculty#getProgrammes()
	 * @see #getFaculty()
	 * @generated
	 */
	EReference getFaculty_Programmes();

	/**
	 * Returns the meta object for class '{@link assignment.studyprog.Programme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme</em>'.
	 * @see assignment.studyprog.Programme
	 * @generated
	 */
	EClass getProgramme();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Programme#getProgrammeName <em>Programme Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Programme Name</em>'.
	 * @see assignment.studyprog.Programme#getProgrammeName()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_ProgrammeName();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.studyprog.Programme#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see assignment.studyprog.Programme#getSpecializations()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Specializations();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.studyprog.Programme#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see assignment.studyprog.Programme#getSemesters()
	 * @see #getProgramme()
	 * @generated
	 */
	EReference getProgramme_Semesters();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Programme#getNeededCredits <em>Needed Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needed Credits</em>'.
	 * @see assignment.studyprog.Programme#getNeededCredits()
	 * @see #getProgramme()
	 * @generated
	 */
	EAttribute getProgramme_NeededCredits();

	/**
	 * Returns the meta object for class '{@link assignment.studyprog.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see assignment.studyprog.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Specialization#getSpecializationName <em>Specialization Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specialization Name</em>'.
	 * @see assignment.studyprog.Specialization#getSpecializationName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_SpecializationName();

	/**
	 * Returns the meta object for the container reference '{@link assignment.studyprog.Specialization#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specializations</em>'.
	 * @see assignment.studyprog.Specialization#getSpecializations()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Specializations();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.studyprog.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see assignment.studyprog.Specialization#getSemesters()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Semesters();

	/**
	 * Returns the meta object for class '{@link assignment.studyprog.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see assignment.studyprog.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.studyprog.Semester#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mandatory</em>'.
	 * @see assignment.studyprog.Semester#getMandatory()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Mandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment.studyprog.Semester#getElective <em>Elective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elective</em>'.
	 * @see assignment.studyprog.Semester#getElective()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_Elective();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Semester#getSemesterNum <em>Semester Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semester Num</em>'.
	 * @see assignment.studyprog.Semester#getSemesterNum()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_SemesterNum();

	/**
	 * Returns the meta object for class '{@link assignment.studyprog.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see assignment.studyprog.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Course#getCourseName <em>Course Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Name</em>'.
	 * @see assignment.studyprog.Course#getCourseName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseName();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Course#getCourseCode <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Code</em>'.
	 * @see assignment.studyprog.Course#getCourseCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCode();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Course#getCourseCredit <em>Course Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Credit</em>'.
	 * @see assignment.studyprog.Course#getCourseCredit()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseCredit();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Course#getCourseDescription <em>Course Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Description</em>'.
	 * @see assignment.studyprog.Course#getCourseDescription()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseDescription();

	/**
	 * Returns the meta object for the attribute '{@link assignment.studyprog.Course#getCourseGroup <em>Course Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course Group</em>'.
	 * @see assignment.studyprog.Course#getCourseGroup()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_CourseGroup();

	/**
	 * Returns the meta object for class '{@link assignment.studyprog.MandatoryCourse <em>Mandatory Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Course</em>'.
	 * @see assignment.studyprog.MandatoryCourse
	 * @generated
	 */
	EClass getMandatoryCourse();

	/**
	 * Returns the meta object for class '{@link assignment.studyprog.ElectiveCourse <em>Elective Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elective Course</em>'.
	 * @see assignment.studyprog.ElectiveCourse
	 * @generated
	 */
	EClass getElectiveCourse();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StudyprogFactory getStudyprogFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assignment.studyprog.impl.FacultyImpl <em>Faculty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.studyprog.impl.FacultyImpl
		 * @see assignment.studyprog.impl.StudyprogPackageImpl#getFaculty()
		 * @generated
		 */
		EClass FACULTY = eINSTANCE.getFaculty();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACULTY__PROGRAMMES = eINSTANCE.getFaculty_Programmes();

		/**
		 * The meta object literal for the '{@link assignment.studyprog.impl.ProgrammeImpl <em>Programme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.studyprog.impl.ProgrammeImpl
		 * @see assignment.studyprog.impl.StudyprogPackageImpl#getProgramme()
		 * @generated
		 */
		EClass PROGRAMME = eINSTANCE.getProgramme();

		/**
		 * The meta object literal for the '<em><b>Programme Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__PROGRAMME_NAME = eINSTANCE.getProgramme_ProgrammeName();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SPECIALIZATIONS = eINSTANCE.getProgramme_Specializations();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME__SEMESTERS = eINSTANCE.getProgramme_Semesters();

		/**
		 * The meta object literal for the '<em><b>Needed Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME__NEEDED_CREDITS = eINSTANCE.getProgramme_NeededCredits();

		/**
		 * The meta object literal for the '{@link assignment.studyprog.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.studyprog.impl.SpecializationImpl
		 * @see assignment.studyprog.impl.StudyprogPackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Specialization Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__SPECIALIZATION_NAME = eINSTANCE.getSpecialization_SpecializationName();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SPECIALIZATIONS = eINSTANCE.getSpecialization_Specializations();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SEMESTERS = eINSTANCE.getSpecialization_Semesters();

		/**
		 * The meta object literal for the '{@link assignment.studyprog.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.studyprog.impl.SemesterImpl
		 * @see assignment.studyprog.impl.StudyprogPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__MANDATORY = eINSTANCE.getSemester_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Elective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__ELECTIVE = eINSTANCE.getSemester_Elective();

		/**
		 * The meta object literal for the '<em><b>Semester Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEMESTER_NUM = eINSTANCE.getSemester_SemesterNum();

		/**
		 * The meta object literal for the '{@link assignment.studyprog.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.studyprog.impl.CourseImpl
		 * @see assignment.studyprog.impl.StudyprogPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_NAME = eINSTANCE.getCourse_CourseName();

		/**
		 * The meta object literal for the '<em><b>Course Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CODE = eINSTANCE.getCourse_CourseCode();

		/**
		 * The meta object literal for the '<em><b>Course Credit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_CREDIT = eINSTANCE.getCourse_CourseCredit();

		/**
		 * The meta object literal for the '<em><b>Course Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_DESCRIPTION = eINSTANCE.getCourse_CourseDescription();

		/**
		 * The meta object literal for the '<em><b>Course Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE_GROUP = eINSTANCE.getCourse_CourseGroup();

		/**
		 * The meta object literal for the '{@link assignment.studyprog.impl.MandatoryCourseImpl <em>Mandatory Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.studyprog.impl.MandatoryCourseImpl
		 * @see assignment.studyprog.impl.StudyprogPackageImpl#getMandatoryCourse()
		 * @generated
		 */
		EClass MANDATORY_COURSE = eINSTANCE.getMandatoryCourse();

		/**
		 * The meta object literal for the '{@link assignment.studyprog.impl.ElectiveCourseImpl <em>Elective Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment.studyprog.impl.ElectiveCourseImpl
		 * @see assignment.studyprog.impl.StudyprogPackageImpl#getElectiveCourse()
		 * @generated
		 */
		EClass ELECTIVE_COURSE = eINSTANCE.getElectiveCourse();

	}

} //StudyprogPackage
