/**
 */
package com.abernard.airports;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abernard.airports.Gate#getNumber <em>Number</em>}</li>
 *   <li>{@link com.abernard.airports.Gate#getDestination <em>Destination</em>}</li>
 *   <li>{@link com.abernard.airports.Gate#getOrigin <em>Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abernard.airports.AirportsPackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see com.abernard.airports.AirportsPackage#getGate_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link com.abernard.airports.Gate#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.abernard.airports.Gate#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Gate)
	 * @see com.abernard.airports.AirportsPackage#getGate_Destination()
	 * @see com.abernard.airports.Gate#getOrigin
	 * @model opposite="origin"
	 * @generated
	 */
	Gate getDestination();

	/**
	 * Sets the value of the '{@link com.abernard.airports.Gate#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Gate value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.abernard.airports.Gate#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Gate)
	 * @see com.abernard.airports.AirportsPackage#getGate_Origin()
	 * @see com.abernard.airports.Gate#getDestination
	 * @model opposite="destination"
	 * @generated
	 */
	Gate getOrigin();

	/**
	 * Sets the value of the '{@link com.abernard.airports.Gate#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Gate value);

} // Gate
