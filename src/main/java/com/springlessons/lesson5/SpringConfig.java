package com.springlessons.lesson5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicMusic classicMusicBean() {
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusicBean() {
        return new RockMusic();
    }

    @Bean
    public PopMusic popMusicBean() {
        return new PopMusic();
    }

    @Bean
    public List<Music> listMusicBean() {
        return Arrays.asList(classicMusicBean(), rockMusicBean(), popMusicBean());
    }

    @Bean
    public MusicPlayer musicPlayerBean() {
        return new MusicPlayer(listMusicBean());
    }
}
