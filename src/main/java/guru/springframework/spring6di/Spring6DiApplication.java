package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"guru.springframework"})
public class Spring6DiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Spring6DiApplication.class, args);

        MyController myController = context.getBean("myController", MyController.class);

        System.out.println(myController.sayHello());

    }

}
