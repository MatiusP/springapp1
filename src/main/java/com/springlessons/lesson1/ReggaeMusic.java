package com.springlessons.lesson1;

import org.springframework.stereotype.Component;

@Component
public class ReggaeMusic implements Music {
    public String getSong() {
        return "Jamin";
    }
}
