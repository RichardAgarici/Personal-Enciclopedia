package sda.exemple1;

/**
 * * Create a Parcel class with the parameters:
 *  * • int xLength
 *  * • int yLength
 *  * • int zLength
 *  * • float weight
 *  * • boolean isExpress
 */

public class Parcel {

    private int length;
    private int width;
    private int height;
    private float weight;
    private boolean isExpress;

    public Parcel(int length, int width, int height, float weight, boolean isExpress) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public String toString() {
        return "Parcel{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                ", isExpress=" + isExpress +
                '}';
    }
}