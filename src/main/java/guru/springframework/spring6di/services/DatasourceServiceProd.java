package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("datasourceServiceEnv")
public class DatasourceServiceProd implements DatasourceService {
    @Override
    public String getDatasource() {
        return "prod";
    }
}
