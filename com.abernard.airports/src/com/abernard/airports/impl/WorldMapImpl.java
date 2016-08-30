/**
 */
package com.abernard.airports.impl;

import com.abernard.airports.Airport;
import com.abernard.airports.AirportsPackage;
import com.abernard.airports.WorldMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abernard.airports.impl.WorldMapImpl#getAirports <em>Airports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorldMapImpl extends MinimalEObjectImpl.Container implements WorldMap {
	/**
	 * The cached value of the '{@link #getAirports() <em>Airports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAirports()
	 * @generated
	 * @ordered
	 */
	protected EList<Airport> airports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AirportsPackage.Literals.WORLD_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Airport> getAirports() {
		if (airports == null) {
			airports = new EObjectContainmentEList<Airport>(Airport.class, this, AirportsPackage.WORLD_MAP__AIRPORTS);
		}
		return airports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AirportsPackage.WORLD_MAP__AIRPORTS:
				return ((InternalEList<?>)getAirports()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AirportsPackage.WORLD_MAP__AIRPORTS:
				return getAirports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AirportsPackage.WORLD_MAP__AIRPORTS:
				getAirports().clear();
				getAirports().addAll((Collection<? extends Airport>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AirportsPackage.WORLD_MAP__AIRPORTS:
				getAirports().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AirportsPackage.WORLD_MAP__AIRPORTS:
				return airports != null && !airports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorldMapImpl
