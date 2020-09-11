package pl.dominik.conferencedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        Map<String, String> env = System.getenv();
        builder.url(env.get("DB_URL"));
        builder.username(env.get("DB_USER"));
        builder.password(env.get("DB_PASS"));
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }
}
