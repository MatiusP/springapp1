package com.springlessons.lesson1;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    public String getSong() {
        return "Wind of change";
    }
}
