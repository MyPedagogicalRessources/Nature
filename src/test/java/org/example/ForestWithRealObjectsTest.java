package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * The ForestTest class tests the functionality of the Forest class.
 */
public class ForestWithRealObjectsTest {
    /**
     * Tests the getTotalHeight method of the Forest class.
     */
    @Test
    public void testGetTotalHeight() {
        List<Nature> natureList = new ArrayList<>();
        Nature tree1 = new Tree();
        tree1.grow(20);
        Nature tree2 = new Tree();
        tree2.grow(40);
        natureList.add(tree1);
        natureList.add(tree2);
        Forest forest = new Forest(natureList);

        int totalHeight = forest.getTotalHeight();

        assertEquals(30, totalHeight);
    }
}