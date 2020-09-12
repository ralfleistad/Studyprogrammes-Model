/**
 */
package assignment.studyprog;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.Course#getCourseName <em>Course Name</em>}</li>
 *   <li>{@link assignment.studyprog.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link assignment.studyprog.Course#getCourseCredit <em>Course Credit</em>}</li>
 *   <li>{@link assignment.studyprog.Course#getCourseDescription <em>Course Description</em>}</li>
 *   <li>{@link assignment.studyprog.Course#getCourseGroup <em>Course Group</em>}</li>
 * </ul>
 *
 * @see assignment.studyprog.StudyprogPackage#getCourse()
 * @model abstract="true"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Name</em>' attribute.
	 * @see #setCourseName(String)
	 * @see assignment.studyprog.StudyprogPackage#getCourse_CourseName()
	 * @model
	 * @generated
	 */
	String getCourseName();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Course#getCourseName <em>Course Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Name</em>' attribute.
	 * @see #getCourseName()
	 * @generated
	 */
	void setCourseName(String value);

	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see assignment.studyprog.StudyprogPackage#getCourse_CourseCode()
	 * @model dataType="assignment.studyprog.courseCode"
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Course Credit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Credit</em>' attribute.
	 * @see #setCourseCredit(double)
	 * @see assignment.studyprog.StudyprogPackage#getCourse_CourseCredit()
	 * @model
	 * @generated
	 */
	double getCourseCredit();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Course#getCourseCredit <em>Course Credit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Credit</em>' attribute.
	 * @see #getCourseCredit()
	 * @generated
	 */
	void setCourseCredit(double value);

	/**
	 * Returns the value of the '<em><b>Course Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Description</em>' attribute.
	 * @see #setCourseDescription(String)
	 * @see assignment.studyprog.StudyprogPackage#getCourse_CourseDescription()
	 * @model
	 * @generated
	 */
	String getCourseDescription();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Course#getCourseDescription <em>Course Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Description</em>' attribute.
	 * @see #getCourseDescription()
	 * @generated
	 */
	void setCourseDescription(String value);

	/**
	 * Returns the value of the '<em><b>Course Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Group</em>' attribute.
	 * @see #setCourseGroup(String)
	 * @see assignment.studyprog.StudyprogPackage#getCourse_CourseGroup()
	 * @model
	 * @generated
	 */
	String getCourseGroup();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Course#getCourseGroup <em>Course Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Group</em>' attribute.
	 * @see #getCourseGroup()
	 * @generated
	 */
	void setCourseGroup(String value);

} // Course
