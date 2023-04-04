package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DataSourceControllerDevTest {

    @Autowired
    private DataSourceController dataSourceController;

    @Test
    public void getDatasource() {

        System.out.println(dataSourceController.getDatasource());

    }
}
