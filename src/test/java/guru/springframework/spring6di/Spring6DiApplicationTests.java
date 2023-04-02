package guru.springframework.spring6di;

import guru.springframework.spring6di.controller.MyController;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private MyController myController;

    @Test
    void getAutowiredController() {
        Assertions.assertThat(this.myController.sayHello()).isEqualTo("Hello world!!");
    }

    @Test
    void getControllerFromContext() {

        MyController myController = this.applicationContext.getBean(MyController.class);

        Assertions.assertThat(myController.sayHello()).isEqualTo("Hello world!!");

    }

    @Test
    void contextLoads() {
    }

}
