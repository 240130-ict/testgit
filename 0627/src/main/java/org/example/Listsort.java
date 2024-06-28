package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Listsort {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a","c","k","g","d"));

        for(String s : list){
            System.out.print(s + ",");
        }
        System.out.println("");
        list.sort(Comparator.naturalOrder());
        for(String s : list){
            System.out.print(s + ",");
        }
    }
}
