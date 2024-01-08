package pierpaolo.u5w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pierpaolo.u5w1d1.entities.Pizza;

@SpringBootApplication
public class U5w1d1Application {

	public static void main(String[] args) {

		SpringApplication.run(U5w1d1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5w1d1Application.class);
		Pizza p = (Pizza) ctx.getBean("getPizza");
		System.out.println(p);
		Pizza pc = (Pizza) ctx.getBean("pizzaContadina");
		System.out.println(pc);
	}

}
