package com.entertainment.client;

import com.entertainment.Television;

import java.util.*;

class TelevisionClient {
    public static void main(String[] args) {
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);
        Television tvC = new Television("Sony", 52);
        Television tvD = new Television("Sony", 12);

        // compare behavior of == and equals ()
        System.out.println("tvA == tvB: "      + (tvA == tvB));
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB));
        System.out.println();

        // Let's create a Set<Television> and see what happens
        Set<Television> tvs = new LinkedHashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        tvs.add(tvC);
        tvs.add(tvD);


        // The size of the Set should be 1 and alas, IT IS!
        System.out.println("The size of the Set is: " + tvs.size());
        for (Television tv : tvs) {
            System.out.println(tv);
        }
    }
}