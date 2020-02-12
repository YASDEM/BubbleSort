package Printer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class MyBean {

	@Autowired
	@Qualifier("boys")
	Printer print;
	
	public void print() {
		print.print();
	}
	
	
	
	public static void main (String args[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Printer");

		MyBean bean = context.getBean(MyBean.class);
		bean.print();
	}
		
	

}
