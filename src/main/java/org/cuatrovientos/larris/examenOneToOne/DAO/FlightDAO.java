package org.cuatrovientos.larris.examenOneToOne.DAO;

import org.cuatrovientos.larris.examenOneToMany.HibernateSession;
import org.cuatrovientos.larris.examenOneToMany.models.Flight;
import org.cuatrovientos.larris.examenOneToMany.models.Passenger;
import org.cuatrovientos.larris.examenOneToOne.DAOInteface.FlightDAOInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class FlightDAO implements FlightDAOInterface{

	public Flight selectById(Long id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Flight flight = (Flight) session.get(Flight.class, id);
		session.close();
		return flight;
	}

	public void insertFlight(Flight flight) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(flight);
	         
	    session.getTransaction().commit();
	    session.close();
	}

}
