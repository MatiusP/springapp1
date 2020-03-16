package com.springlessons.lesson1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player2 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean io = player1 == player2;
        System.out.println(io);

        System.out.println(player1);
        System.out.println(player2);

        player1.setVolume(66);
        System.out.println(player1.getVolume());
        System.out.println(player2.getVolume());
//        player.playMusicList();
//        System.out.println(player.getPlayerName());
//        System.out.println(player.getVolume());

    }
}
