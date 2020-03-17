package com.springlessons.lesson3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

//@Component
public class MusicPlayer {
    private ClassicMusic classicMusic;
    private RockMusic rockMusic;

    @Value("${musicPlayer.playerName}")
    private String playerName;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getPlayerName() {
        return playerName;
    }

    public int getVolume() {
        return volume;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Initialisation...");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroying...");
    }

//    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    private String getSong(List<String> musicList) {
        int randomSong = (int) (Math.random() * 3);
        return musicList.get(randomSong);
    }

    public void playMusic(EnumClass enumObject) {
        List<String> musicList;
        if (enumObject.equals(EnumClass.CLASSICAL)) {
            musicList = classicMusic.getSong();
            System.out.println(getSong(musicList));
        } else {
            musicList = rockMusic.getSong();
            System.out.println(getSong(musicList));
        }
    }
}
