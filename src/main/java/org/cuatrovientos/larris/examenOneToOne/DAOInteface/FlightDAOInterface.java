package org.cuatrovientos.larris.examenOneToOne.DAOInteface;


import org.cuatrovientos.larris.examenOneToMany.models.Flight;

public interface FlightDAOInterface {
	
	public Flight selectById(Long id);
	public void insertFlight(Flight flight);
}
