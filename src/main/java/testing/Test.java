package testing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.*;
public class Test {
	/**
	 * @param args
	 */
	public static void main(String []args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("/resources/empConfig.xml");
		Employee e1 = (Employee)ac.getBean("emp1");
		Employee e2 = (Employee)ac.getBean("emp2");
		Employee e3 = (Employee)ac.getBean("emp3");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3); 
		
//		
//		Car v1 = (Car)ac.getBean("car");
//		Tyre t1 = (Tyre)ac.getBean("tyre");
//		v1.drive();
//		v1.setTyre(t1);
//		System.out.println(v1.getTyre());
		
		
		Employee e4 = (Employee)ac.getBean("emp4");
		Address a1 = (Address)e4.getAddress();
		System.out.println(e4);
		
		Employee emp5List = (Employee)ac.getBean("emp5List");
		System.out.println(emp5List);
		
		Employee empObject = (Employee)ac.getBean("empObject");
		System.out.println("----------");
		System.out.println(empObject);
		
	}
}
