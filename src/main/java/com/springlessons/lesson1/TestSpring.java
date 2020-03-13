package com.springlessons.lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        player.playMusicList();
        System.out.println(player.getPlayerName());
        System.out.println(player.getVolume());

    }
}
