package org.example;

public class DummyTree implements Nature {

    private final int height;

    public DummyTree(int height) {
        this.height = height;
    }

    @Override
    public void grow(int waterAmount) {
        // do nothing
    }

    @Override
    public int getHeight() {
        return height;
    }
}
