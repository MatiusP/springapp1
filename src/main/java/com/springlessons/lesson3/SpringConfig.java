package com.springlessons.lesson3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springlessons.lesson3")
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicMusic classicMusicBean(){
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusicBean(){
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayerBean(){
        return new MusicPlayer(classicMusicBean(), rockMusicBean());
    }
}
