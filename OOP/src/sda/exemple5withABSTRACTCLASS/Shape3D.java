package sda.exemple5withABSTRACTCLASS;

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task.
 * Add an additional method calculateVolume().
 * Create Cone and Qube classes by extending the 3DShape class, properly implementing abstract methods.
 * Verify the solution correctness.
 */
public abstract class Shape3D extends Shape implements Fillable{

    public abstract double calculateVolume();

    @Override
    public void fill(double water) {
        double volume = calculateVolume();
        if(volume > water){
            System.out.println("Not pouring enough water");
        } else if (volume==water) {
            System.out.println("enough water");
        }else{
            System.out.println("Too much water");
    }
    }
}
