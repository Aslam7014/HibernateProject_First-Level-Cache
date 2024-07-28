package com.jsp.Hibernate.HiberNateProject_FirstLevelChache_01;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
    	
//    	Dish dish = new Dish();
//    	dish.setDishId(101);
//    	dish.setDishName("Rice");
//    	dish.setDishPrice(100);
    	
    	
    	Configuration cgf = new Configuration().configure().addAnnotatedClass(Dish.class);
    	SessionFactory sf = cgf.buildSessionFactory();
    	Session session = sf.openSession();
    	Transaction tran = session.beginTransaction();
    	
    	Dish d = session.get(Dish.class, 101);
    	System.out.println(d);
    	
    	Dish d1 = session.get(Dish.class, 101);
    	System.out.println(d1);
    	
//    	session.save(dish);
    	tran.commit();
    	session.close();
    	sf.close();
      
    }
}
