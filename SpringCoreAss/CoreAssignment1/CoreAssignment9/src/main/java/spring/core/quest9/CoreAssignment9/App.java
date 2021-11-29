 package spring.core.quest9.CoreAssignment9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("core9.xml");
		LifeCycleDemo object= (LifeCycleDemo) context.getBean("HelloWorld");
		System.out.println(object.getMessage());
		context.registerShutdownHook();
	}
}