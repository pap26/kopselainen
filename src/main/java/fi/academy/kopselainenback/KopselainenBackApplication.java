package fi.academy.kopselainenback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class KopselainenBackApplication extends SpringBootServletInitializer {

    private static final Logger loggeri = LoggerFactory.getLogger(KopselainenBackApplication.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(KopselainenBackApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(KopselainenBackApplication.class, args);
    }
}
