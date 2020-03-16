package com.springlessons.lesson2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockMusicList = new ArrayList<String>();

    {
        rockMusicList.add("Wind of change");
        rockMusicList.add("Fool moon");
        rockMusicList.add("Ratamahatta");
    }

    public List<String> getSong() {
        return rockMusicList;
    }
}
