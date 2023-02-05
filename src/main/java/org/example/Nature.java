package org.example;

/**
 * The Nature interface defines operations for growing and getting the height of an object.
 */
public interface Nature {
    /**
     * Grows the object by the specified amount of water.
     * @param waterAmount the amount of water used for growing
     */
    void grow(int waterAmount);

    /**
     * Gets the height of the object.
     * @return the height of the object
     */
    int getHeight();
}







