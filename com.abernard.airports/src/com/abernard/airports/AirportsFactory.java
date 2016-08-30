/**
 */
package com.abernard.airports;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.abernard.airports.AirportsPackage
 * @generated
 */
public interface AirportsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirportsFactory eINSTANCE = com.abernard.airports.impl.AirportsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>World Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>World Map</em>'.
	 * @generated
	 */
	WorldMap createWorldMap();

	/**
	 * Returns a new object of class '<em>Airport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Airport</em>'.
	 * @generated
	 */
	Airport createAirport();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	Gate createGate();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AirportsPackage getAirportsPackage();

} //AirportsFactory
