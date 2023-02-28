/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.Catalog;
import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

class InMemoryCatalogTest {


    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // testFindById();              // complete
        // testFindByKeyword();         //
        // testFindByCategory();        // complete
        // testSize();                  // complete
        // testGetAll();                // complete (used copyOf and want to use the other one)
        // testFindSelfTitled();        // complete
        // testFindRockBottom();        //
        // testFindGenreCount();        //
        // testFindAverageCost();       //
        // testFindCheapestInGenre();   //
        // testFindAverageInGenre();    //
        // testIsAtLeast();             //
        // testGenreInStock();          //
        // testFindAllPop();            //
        // testFindCheapEighties();     //

    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem item = catalog.findById(12L);
        System.out.println(item);

        MusicItem notFound = catalog.findById(19L);
        System.out.println(notFound);
    }

    private static void testFindByKeyword() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.findByKeyword("ROCK");
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }

    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size());
    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.getAll();
        dump(catalog.getAll());
    }

    private static void testFindSelfTitled() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> item = catalog.findSelfTitled();
        dump(catalog.findSelfTitled());
    }

    //  private static void testFindRockBottom();

    // private static void testFindGenreCount();

    // private static void testFindAverageCost();

    // private static void testFindCheapestInGenre();

    // private static void testFindAverageInGenre();

    // private static void testIsAtLeast();

    // private static void testGenreInStock();

    // private static void testFindAllPop();

    // private static void testFindCheapEighties();

    private static void dump (Collection items){
        for(var item : items) {
            System.out.println(item);
        }
    }
}