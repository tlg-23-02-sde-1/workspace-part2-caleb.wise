package com.javatunes.catalog;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    //findById  (x2 Tests)
    @Test
    public void findById_shouldReturnNull_whenIdNotFound() {
        MusicItem item = catalog.findById(1000L);
        assertNull(item);
    }

    @Test
    public void findById_shouldReturnMusicItemWithThatId_whenIdFound() {
        MusicItem item = catalog.findById(12L);
        assertEquals(12L, item.getId().longValue());  // assertEquals(Object, Object)
    }

    // testFindByKeyword

    // testFindByCategory

    // testSize

    // testGetAll

    // findSelfTitled (x1 Test)

    // testSize (No Test Needed)

    //getAll (x1 Test)
    @Test(expected=UnsupportedOperationException.class)
    public void getAll_ShouldReturnReadonlyCollection() throws UnsupportedOperationException {
        Collection<MusicItem> items = catalog.getAll();
        items.clear(); // should trigger UnsupportedOperationException
    }

    // testFindSelfTitled
    @Test
    public void findSelfTitled_shouldReturnCorrectResult() {
        Collection<MusicItem> items = catalog.findSelfTitled();
        //size should be 2, id should be 6 and 7

        assertEquals(2, items.size());
        // I need to extract (get) the first one and make sure its id is 6, then the 2nd one
        List<MusicItem> itemsList = new ArrayList<>(items);
        itemsList.sort(null); // sorts by natural order (MusicItem's natural order is id)
        // now you can say itemsList.getArrayList
        assertEquals(6L, itemsList.get(0).getId().longValue());
        assertEquals(7L, itemsList.get(1).getId().longValue());
    }

    // testFindRockBottom
    // testFindGenreCount
    // testFindAverageCost
    // testFindCheapestInGenre
    // testFindAverageInGenre
    // testIsAtLeast
    // testGenreInStock
    // testFindAllPop
    // testFindCheapEighties
}