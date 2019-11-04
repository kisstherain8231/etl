package config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("service")
@ImportResource(locations= {"classpath:core-config.xml"})
public class AppConfig {

}
