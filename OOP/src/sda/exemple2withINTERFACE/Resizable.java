package sda.exemple2withINTERFACE;

/**
 * Create a Resizable interface with the resize(double resizeFactor) method.
 * Implement the interface in the class from the previous task (Circle). When calling the resize(double resizeFactor) method, the circle should change its size by a given factor (1.5, 0.5, 10.0, etc.).
 * Validate the resizing by calling the other Circle methods.
 */
public interface Resizable {
    void resize (double resizeFactor);
}
