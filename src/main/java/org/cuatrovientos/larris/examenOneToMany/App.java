package org.cuatrovientos.larris.examenOneToMany;


import java.util.Date;
import java.util.List;

import org.cuatrovientos.larris.examenOneToMany.models.Flight;
import org.cuatrovientos.larris.examenOneToMany.models.Passenger;
import org.cuatrovientos.larris.examenOneToOne.DAO.FlightDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Flight flight = new Flight("Flight1", new Date(21/12/2016));
        
        flight.addPassenger(new Passenger("Manu", "629182548"));
        flight.addPassenger(new Passenger("Robert", "624972148"));
        flight.addPassenger(new Passenger("Juan", "684752149"));
        
        FlightDAO flightDao = new FlightDAO();
        
        flightDao.insertFlight(flight);
        
        
        Flight selectedFlight = flightDao.selectById(1l);
        
		System.out.println("--- Flight ----- table contents	-----------");

		System.out.println("Id: " + selectedFlight.getId());
		System.out.println(" - Name: " + selectedFlight.getName());
		System.out.println(" - Date: " + selectedFlight.getDate());
		System.out.println(" - Passengers: ");
		List<Passenger> pass = selectedFlight.getPassengers();
		
		for (int i = 0; i < pass.size(); i++) {
			System.out.println("   " + pass.get(i).toString());
		}
		
		
        
    }
}
