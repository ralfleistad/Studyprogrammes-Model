/**
 */
package assignment.studyprog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.Semester#getMandatory <em>Mandatory</em>}</li>
 *   <li>{@link assignment.studyprog.Semester#getElective <em>Elective</em>}</li>
 *   <li>{@link assignment.studyprog.Semester#getSemesterNum <em>Semester Num</em>}</li>
 * </ul>
 *
 * @see assignment.studyprog.StudyprogPackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.studyprog.MandatoryCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' containment reference list.
	 * @see assignment.studyprog.StudyprogPackage#getSemester_Mandatory()
	 * @model containment="true"
	 * @generated
	 */
	EList<MandatoryCourse> getMandatory();

	/**
	 * Returns the value of the '<em><b>Elective</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.studyprog.ElectiveCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective</em>' containment reference list.
	 * @see assignment.studyprog.StudyprogPackage#getSemester_Elective()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElectiveCourse> getElective();

	/**
	 * Returns the value of the '<em><b>Semester Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Num</em>' attribute.
	 * @see #setSemesterNum(int)
	 * @see assignment.studyprog.StudyprogPackage#getSemester_SemesterNum()
	 * @model
	 * @generated
	 */
	int getSemesterNum();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Semester#getSemesterNum <em>Semester Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Num</em>' attribute.
	 * @see #getSemesterNum()
	 * @generated
	 */
	void setSemesterNum(int value);

} // Semester
