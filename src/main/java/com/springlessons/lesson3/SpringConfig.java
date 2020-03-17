package com.springlessons.lesson3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springlessons.lesson3")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
}
