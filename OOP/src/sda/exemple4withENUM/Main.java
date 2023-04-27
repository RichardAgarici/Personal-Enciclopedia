package sda.exemple4withENUM;

public class Main {
    public static void main(String[] args) {
        System.out.println("Price of Ferrari: "+ Car.FERRARI.getPrice());
        System.out.println("Power of Ferrari: "+Car.FERRARI.getPower());
        System.out.println("Power of Ferrari: "+Car.FERRARI.isFasterThan(Car.BMW));
        System.out.println("Power of Ferrari: "+Car.FERRARI.isPremium());
        System.out.println("Power of Ferrari: "+Car.FERRARI.isRegular());

    }
}
