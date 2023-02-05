package org.example;

import java.util.List;

/**
 * The Forest class represents a collection of Nature objects.
 */
public class Forest {
    private List<Nature> natureList;

    /**
     * Constructs a new Forest with the specified list of Nature objects.
     * @param natureList the list of Nature objects
     */
    public Forest(List<Nature> natureList) {
        this.natureList = natureList;
    }

    /**
     * Gives water to all the Nature objects in the Forest.
     * @param waterAmount the amount of water to give
     */
    public void giveWater(int waterAmount) {
        for (Nature nature : natureList) {
            nature.grow(waterAmount);
        }
    }

    /**
     * Gets the total height of all the Nature objects in the Forest.
     * @return the total height of all the Nature objects
     */
    public int getTotalHeight() {
        int totalHeight = 0;
        for (Nature nature : natureList) {
            totalHeight += nature.getHeight();
        }
        return totalHeight;
    }
}
