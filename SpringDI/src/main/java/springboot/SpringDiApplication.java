package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springboot.model.Employee;
import springboot.model.User;

public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext apContext=new ClassPathXmlApplicationContext("classpath:springContext.xml");
		User user=(User) apContext.getBean("userbean");
		System.out.println(user.show());
		
		Employee emp=(Employee) apContext.getBean("useremp");
		System.out.println(emp.show());
		
		Employee emp1=(Employee)apContext.getBean("useremp1");
		System.out.println(emp1.show());
		//SpringApplication.run(SpringDiApplication.class, args);
	}

}
