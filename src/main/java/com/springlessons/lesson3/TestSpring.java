package com.springlessons.lesson3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        player.playMusic(EnumClass.ROCK);
        System.out.println(player.getPlayerName());
        System.out.println(player.getVolume());

        ClassicMusic classicMusic1 = context.getBean("classicMusic", ClassicMusic.class);
    }
}
