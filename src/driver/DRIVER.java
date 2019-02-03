package driver;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bean.Student;

public class DRIVER {

	public static void main(String[] args) {
		Student s1=new Student();    
	    s1.setName("Maidul Islam Fahim");    
	    s1.setEmail("fahimmaidul@gmail.com");
	    s1.setMarks(95);
	    s1.setId(112);
		Configuration config = new Configuration();
		config.configure("configurations/hibernate.cfg.xml");
		SessionFactory sfactory = config.buildSessionFactory();
		Session session = sfactory.openSession();           
		session.save(s1);    
		session.beginTransaction().commit();
		System.out.println("successfully saved");
		session.evict(s1);
	}

}
