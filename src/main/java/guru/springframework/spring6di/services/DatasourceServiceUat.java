package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("datasourceServiceEnv")
public class DatasourceServiceUat implements DatasourceService {
    @Override
    public String getDatasource() {
        return "uat";
    }
}
