package decorator;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree = new BubbleLights(new ChristmasTreeImpl());
        System.out.println(tree.decorate());

        ChristmasTree tree2 = new BubbleLights(new Garland(new BubbleLights(new Garland(new ChristmasTreeImpl()))));
        System.out.println(tree2.decorate());
    }
}
