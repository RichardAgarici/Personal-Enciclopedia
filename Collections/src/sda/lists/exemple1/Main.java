package sda.lists.exemple1;

/**
 * Ex 6 Ratings received. Display their average. The numbers can not be less than 1 and greater than 6.
 */

public class Main {
    public static void main(String[] args) {

        ProductRatings product = new ProductRatings("CD");
        System.out.println(product.averageRating());

        product.addRating(1);
        product.addRating(4);
        product.addRating(5);
        product.addRating(4);
        product.addRating(3);
        product.addRating(2);

        System.out.println(product.averageRating());

        product.addRating(0);
        product.addRating(8);

    }
}



