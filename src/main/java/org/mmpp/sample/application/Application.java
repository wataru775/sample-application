package org.mmpp.sample.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

// THX : https://github.com/kemitix/spring-boot-awt-gui-demo

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .headless(false)
                .web(false)
                .run(args);
    }
    @Bean
    public MainFrame frame() {
        return new MainFrame();
    }

}
