package sda.map.exemple3;

public class Main {

    public static void main(String[] args) {

        var students = new Storage();
        students.addToStorage("RO45","Andrei");
        students.addToStorage("RO45","Alex");
        students.addToStorage("RO45","Larisa");
        students.addToStorage("RO45","Dumitru");
        System.out.println("-------------------");
        students.addToStorage("RO46", "Andrei");
        students.addToStorage("RO46", "Bogdan");
        students.addToStorage("RO46", "Elena");

        students.printValues("RO45");
        students.printValues("RO46");
        students.printValues("RO47");

        System.out.println(students.findKeys("Andrei"));
        System.out.println(students.findKeys("Bogdan"));
        System.out.println(students.findKeys("Ion"));
    }


}
