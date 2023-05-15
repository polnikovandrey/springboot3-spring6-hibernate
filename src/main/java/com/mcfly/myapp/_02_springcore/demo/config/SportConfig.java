package com.mcfly.myapp._02_springcore.demo.config;

import com.mcfly.common.Coach;
import com.mcfly.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    /* A @Bean annotation is generally intended to be used in case there is no way to annotate a class wit @Component annotation (e.g. third party java library). */
    @Bean("swim100")
    public Coach swim100Coach() {
        return new SwimCoach(100);
    }

    /* A @Bean annotation is generally intended to be used in case there is no way to annotate a class wit @Component annotation (e.g. third party java library). */
    @Bean("swim500")
    public Coach swim500Coach() {
        return new SwimCoach(500);
    }
}
