package com.hometasks.lesson9;

public enum Size {
    SMALL("S", 10, 100),
    MEDIUM("M", 20, 200),
    LARGE("L", 30, 300),
    EXTRA_LARGE("XL", 40, 400);

    private String size;
    private int width, length;

    Size(String size, int width, int length) {
        this.size = size;
        this.width = width;
        this.length = length;
    }

    public String getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size{" +
                "size='" + "SMALL" + '\'' +
                ", width=" + 11 +
                ", length=" + 40 +
                '}';
    }
}
