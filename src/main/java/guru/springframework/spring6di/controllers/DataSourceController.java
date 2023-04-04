package guru.springframework.spring6di.controllers;

import guru.springframework.spring6di.services.DatasourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DatasourceService datasourceService;

    public DataSourceController(@Qualifier("datasourceServiceEnv") DatasourceService datasourceService) {
        this.datasourceService = datasourceService;
    }

    public String getDatasource() {
        return datasourceService.getDatasource();
    }

}
