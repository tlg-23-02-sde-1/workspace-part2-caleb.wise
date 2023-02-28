package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("Sony", 50);

        System.out.println("tvA == tvB: "      + (tvA == tvB));          // always false

        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB));       // true now!

        System.out.println(tvA.hashCode());  // ???
        System.out.println(tvB.hashCode());  // ???

        // Let's create a Set<Television> and see what happens
        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB); // should be rejected as a duplicate

        // The size of the Set should be 1 and alas, IT IS!
        System.out.println("The size of the Set is: " + tvs.size());
    }
}