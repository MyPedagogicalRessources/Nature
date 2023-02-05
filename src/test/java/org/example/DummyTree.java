package org.example;

public class DummyTree implements Nature {

    private final int height;

    public DummyTree(int height) {
        this.height = height;
    }

    /**
     * Grows the object by the specified amount of water.
     *
     * @param waterAmount the amount of water used for growing
     */
    @Override
    public void grow(int waterAmount) {
        // do nothing
    }

    /**
     * Gets the height of the object.
     *
     * @return the height of the object
     */
    @Override
    public int getHeight() {
        return 15;
    }
}
