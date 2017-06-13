package tw.edu.nutc.s13023047.hello_hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session;
		
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		session.save(new Event("Hello Hibernate", new Date()));
//		session.save(new Event("Hello Hibernate 2", new Date()));
//		session.getTransaction().commit();
//		session.close();

		session = sessionFactory.openSession();
		session.beginTransaction();
		List<Event> result = session.createQuery("from Event").list();
		for (Event event : result) {
			System.out.println(event.getTitle() + " : " + event.getDate());
		}
		session.getTransaction().commit();
		session.close();
		
		sessionFactory.close();
	}
}
