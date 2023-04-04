package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("datasourceServiceEnv")
public class DatasourceServiceQa implements DatasourceService {
    @Override
    public String getDatasource() {
        return "qa";
    }
}
