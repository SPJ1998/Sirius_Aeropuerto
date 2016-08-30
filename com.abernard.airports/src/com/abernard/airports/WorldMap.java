/**
 */
package com.abernard.airports;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>World Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abernard.airports.WorldMap#getAirports <em>Airports</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abernard.airports.AirportsPackage#getWorldMap()
 * @model
 * @generated
 */
public interface WorldMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Airports</b></em>' containment reference list.
	 * The list contents are of type {@link com.abernard.airports.Airport}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Airports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Airports</em>' containment reference list.
	 * @see com.abernard.airports.AirportsPackage#getWorldMap_Airports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Airport> getAirports();

} // WorldMap
