package org.example.decorator;

public class BubbleLights extends TreeDecorator{

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return " with bubble lights";
    }
}
