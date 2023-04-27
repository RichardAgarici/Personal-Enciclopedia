package sda.exemple1;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement the Validator interface, which will include a boolean validate(Parcel input) method in its declaration.
 * Create a Parcel class with the parameters:
 * • int xLength
 * • int yLength
 * • int zLength
 * • float weight
 * • boolean isExpress
 * The validator should verify that the sum of the dimensions (x, y, z) does not exceed 300,
 * whether each size is not less than 30,
 * whether the weight does not exceed 30.0 for isExpress = false or 15.0 for isExpress = true.
 * In case of errors, it should inform the user about them.
 */

public class Main {

    public static void main(String[] args) {

        List<Parcel> parcelList = new ArrayList<>();
        parcelList.add(new Parcel(31,32,40,29,false));
        parcelList.add(new Parcel(40,32,45,14,true));
        parcelList.add(new Parcel(38,30,45,16,true));
        parcelList.add(new Parcel(45,31,31,32,false));
        parcelList.add(new Parcel(31,15,100,10,false));
        parcelList.add(new Parcel(32,200,100,10,false));

        parcelList.stream()
                .filter(new ParcelValidator())
                .forEach(parcel -> System.out.println(parcel));

    }


}