package sda.exemple1;


import java.util.function.Predicate;

/**
 * * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300,
 * * whether each size is not less than 30,
 * * whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true.
 * * In case of errors, it should inform the user about them.
 */

public class ParcelValidator implements Predicate<Parcel> {


    @Override
    public boolean test(Parcel parcel) {
        int sum = parcel.getLength() + parcel.getHeight() + parcel.getWidth();
        if (sum > 300) {
            System.out.println("The sum of the dimensions exceeds 300");
            return false;
        }
        if (parcel.getHeight() < 30) {
            System.out.println("The height of you package is less then 30");
            return false;
        }
        if (parcel.getLength() < 30) {
            System.out.println("The length of you package is less then 30");
            return false;
        }
        if (parcel.getWidth() < 30) {
            System.out.println("The width of you package is less then 30");
            return false;
        }
        if(parcel.isExpress() && parcel.getWeight() > 15){
            System.out.println("The weight of your express package is greater then 15");
            return false;
        }
        if(!parcel.isExpress() && parcel.getWeight() > 30){
            System.out.println("The weight of your  package is greater then 30");
            return false;
        }
        return true;
    }
}