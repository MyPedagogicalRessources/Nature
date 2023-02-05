package org.example;

/**
 * The Tree class implements the Nature interface and represents a tree.
 */
public class Tree implements Nature {
    private int height;

    @Override
    public void grow(int waterAmount) {
        // well a dummy function to convert water amount in an increasing of height
        height += waterAmount/2;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
