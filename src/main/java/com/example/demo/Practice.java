package com.example.demo;

import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;

public  class  Practice {
    public static int getOccurrences(String source, String word) {
        String cleanedupstring = source.replaceAll("\\.", " ");
        return (int) Arrays.stream(cleanedupstring.split(" ")).filter(w-> w.equalsIgnoreCase(word)).count();
    }
}




