/**
 */
package com.abernard.airports;

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
 * @see com.abernard.airports.AirportsFactory
 * @model kind="package"
 * @generated
 */
public interface AirportsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "airports";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.abernard.airports/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "airports";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AirportsPackage eINSTANCE = com.abernard.airports.impl.AirportsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.abernard.airports.impl.WorldMapImpl <em>World Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abernard.airports.impl.WorldMapImpl
	 * @see com.abernard.airports.impl.AirportsPackageImpl#getWorldMap()
	 * @generated
	 */
	int WORLD_MAP = 0;

	/**
	 * The feature id for the '<em><b>Airports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MAP__AIRPORTS = 0;

	/**
	 * The number of structural features of the '<em>World Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MAP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>World Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORLD_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abernard.airports.impl.AirportImpl <em>Airport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abernard.airports.impl.AirportImpl
	 * @see com.abernard.airports.impl.AirportsPackageImpl#getAirport()
	 * @generated
	 */
	int AIRPORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__COUNTRY = 1;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__GATES = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT__CITY = 3;

	/**
	 * The number of structural features of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Airport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AIRPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abernard.airports.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abernard.airports.impl.GateImpl
	 * @see com.abernard.airports.impl.AirportsPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ORIGIN = 2;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.abernard.airports.WorldMap <em>World Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>World Map</em>'.
	 * @see com.abernard.airports.WorldMap
	 * @generated
	 */
	EClass getWorldMap();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abernard.airports.WorldMap#getAirports <em>Airports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Airports</em>'.
	 * @see com.abernard.airports.WorldMap#getAirports()
	 * @see #getWorldMap()
	 * @generated
	 */
	EReference getWorldMap_Airports();

	/**
	 * Returns the meta object for class '{@link com.abernard.airports.Airport <em>Airport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Airport</em>'.
	 * @see com.abernard.airports.Airport
	 * @generated
	 */
	EClass getAirport();

	/**
	 * Returns the meta object for the attribute '{@link com.abernard.airports.Airport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.abernard.airports.Airport#getName()
	 * @see #getAirport()
	 * @generated
	 */
	EAttribute getAirport_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.abernard.airports.Airport#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see com.abernard.airports.Airport#getCountry()
	 * @see #getAirport()
	 * @generated
	 */
	EAttribute getAirport_Country();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abernard.airports.Airport#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gates</em>'.
	 * @see com.abernard.airports.Airport#getGates()
	 * @see #getAirport()
	 * @generated
	 */
	EReference getAirport_Gates();

	/**
	 * Returns the meta object for the attribute '{@link com.abernard.airports.Airport#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see com.abernard.airports.Airport#getCity()
	 * @see #getAirport()
	 * @generated
	 */
	EAttribute getAirport_City();

	/**
	 * Returns the meta object for class '{@link com.abernard.airports.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see com.abernard.airports.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link com.abernard.airports.Gate#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see com.abernard.airports.Gate#getNumber()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Number();

	/**
	 * Returns the meta object for the reference '{@link com.abernard.airports.Gate#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see com.abernard.airports.Gate#getDestination()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Destination();

	/**
	 * Returns the meta object for the reference '{@link com.abernard.airports.Gate#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see com.abernard.airports.Gate#getOrigin()
	 * @see #getGate()
	 * @generated
	 */
	EReference getGate_Origin();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AirportsFactory getAirportsFactory();

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
		 * The meta object literal for the '{@link com.abernard.airports.impl.WorldMapImpl <em>World Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abernard.airports.impl.WorldMapImpl
		 * @see com.abernard.airports.impl.AirportsPackageImpl#getWorldMap()
		 * @generated
		 */
		EClass WORLD_MAP = eINSTANCE.getWorldMap();

		/**
		 * The meta object literal for the '<em><b>Airports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORLD_MAP__AIRPORTS = eINSTANCE.getWorldMap_Airports();

		/**
		 * The meta object literal for the '{@link com.abernard.airports.impl.AirportImpl <em>Airport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abernard.airports.impl.AirportImpl
		 * @see com.abernard.airports.impl.AirportsPackageImpl#getAirport()
		 * @generated
		 */
		EClass AIRPORT = eINSTANCE.getAirport();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPORT__NAME = eINSTANCE.getAirport_Name();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPORT__COUNTRY = eINSTANCE.getAirport_Country();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AIRPORT__GATES = eINSTANCE.getAirport_Gates();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AIRPORT__CITY = eINSTANCE.getAirport_City();

		/**
		 * The meta object literal for the '{@link com.abernard.airports.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abernard.airports.impl.GateImpl
		 * @see com.abernard.airports.impl.AirportsPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__NUMBER = eINSTANCE.getGate_Number();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__DESTINATION = eINSTANCE.getGate_Destination();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATE__ORIGIN = eINSTANCE.getGate_Origin();

	}

} //AirportsPackage
