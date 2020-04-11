package programs;

import graphics.GraphicElement;

import java.util.ArrayList;

public class MyProgramm {
    public static void main(String[] args) {
        ArrayList<GraphicElement> graphics = new ArrayList<>();
        graphics.add(new GraphicElement(2,5));
        graphics.add(new GraphicElement(3,3));
        graphics.add(new GraphicElement(3,5));

        graphics.set(0,new GraphicElement(graphics.get(0).getX() +3,5));

        for (GraphicElement g: graphics){
            g.render();
        }




    }
}
