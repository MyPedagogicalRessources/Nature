package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * The ForestTest class tests the functionality of the Forest class.
 */
public class ForestWithMockitoTest {
    /**
     * Tests the getTotalHeight method of the Forest class.
     */
    @Test
    public void testGetTotalHeight() {
        // Given a forest with 2 (fake) trees
        List<Nature> natureList = new ArrayList<>();
        Nature tree1 = mock(Tree.class);
        when(tree1.getHeight()).thenReturn(10);
        Nature tree2 = mock(Tree.class);
        when(tree2.getHeight()).thenReturn(20);
        natureList.add(tree1);
        natureList.add(tree2);
        Forest forest = new Forest(natureList);
        // When asking for the total height
        int totalHeight = forest.getTotalHeight();
        // Then we get the expected total height
        assertEquals(30, totalHeight);
    }
}