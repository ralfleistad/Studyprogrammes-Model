/**
 */
package assignment.studyprog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment.studyprog.Programme#getProgrammeName <em>Programme Name</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link assignment.studyprog.Programme#getNeededCredits <em>Needed Credits</em>}</li>
 * </ul>
 *
 * @see assignment.studyprog.StudyprogPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Name</em>' attribute.
	 * @see #setProgrammeName(String)
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_ProgrammeName()
	 * @model
	 * @generated
	 */
	String getProgrammeName();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Programme#getProgrammeName <em>Programme Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Name</em>' attribute.
	 * @see #getProgrammeName()
	 * @generated
	 */
	void setProgrammeName(String value);

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.studyprog.Specialization}.
	 * It is bidirectional and its opposite is '{@link assignment.studyprog.Specialization#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_Specializations()
	 * @see assignment.studyprog.Specialization#getSpecializations
	 * @model opposite="specializations" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link assignment.studyprog.Semester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_Semesters()
	 * @model containment="true" upper="6"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Needed Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needed Credits</em>' attribute.
	 * @see #setNeededCredits(int)
	 * @see assignment.studyprog.StudyprogPackage#getProgramme_NeededCredits()
	 * @model
	 * @generated
	 */
	int getNeededCredits();

	/**
	 * Sets the value of the '{@link assignment.studyprog.Programme#getNeededCredits <em>Needed Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needed Credits</em>' attribute.
	 * @see #getNeededCredits()
	 * @generated
	 */
	void setNeededCredits(int value);

} // Programme
