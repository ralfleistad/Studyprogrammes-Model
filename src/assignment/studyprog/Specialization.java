/**
 */
package assignment.studyprog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.Specialization#getSpecializationName <em>Specialization Name</em>}</li>
 *   <li>{@link assignment.studyprog.Specialization#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see assignment.studyprog.StudyprogPackage#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Specialization Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization Name</em>' attribute.
	 * @see #setSpecializationName(String)
	 * @see assignment.studyprog.StudyprogPackage#getSpecialization_SpecializationName()
	 * @model
	 * @generated
	 */
	String getSpecializationName();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Specialization#getSpecializationName <em>Specialization Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization Name</em>' attribute.
	 * @see #getSpecializationName()
	 * @generated
	 */
	void setSpecializationName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.studyprog.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see assignment.studyprog.StudyprogPackage#getSpecialization_Semesters()
	 * @model containment="true" lower="4" upper="6"
	 * @generated
	 */
	EList<Semester> getSemesters();

} // Specialization
