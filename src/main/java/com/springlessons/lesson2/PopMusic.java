package com.springlessons.lesson2;

import org.springframework.stereotype.Component;

//@Component
public class PopMusic implements Music {
    public String getSong() {
        return "Lalala";
    }
}
