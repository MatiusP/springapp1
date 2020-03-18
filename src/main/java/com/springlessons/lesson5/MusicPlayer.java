package com.springlessons.lesson5;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    private int randomMusic() {
//        int random = (int) (Math.random() * 3);
        return (int) (Math.random() * 3);
    }

    void playMusic(){
        System.out.println(musicList.get(randomMusic()).getSong());
    }
}
