package com.springlessons.lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playSong();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();


    }
}
