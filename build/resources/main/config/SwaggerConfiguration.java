package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean 
    public Docket swaggerApi() {
        return new Docket(DocumentationType.OAS_30)
    }
    
}
