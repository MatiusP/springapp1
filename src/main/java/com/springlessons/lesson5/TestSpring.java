package com.springlessons.lesson5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer player = context.getBean("musicPlayerBean", MusicPlayer.class);

        player.playMusic();
        System.out.println(player.getPlayerName());
        System.out.println(player.getVolume());
    }
}
