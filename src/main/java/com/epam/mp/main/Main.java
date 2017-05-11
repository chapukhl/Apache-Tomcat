package com.epam.mp.main;

import com.epam.mp.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({
        AppConfig.class,
})
public class Main  extends SpringBootServletInitializer {


        @Override
        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(Main.class);
        }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

}
