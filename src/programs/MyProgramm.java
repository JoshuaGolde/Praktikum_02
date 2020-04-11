package programs;

import graphics.GraphicElement;

import java.util.ArrayList;

/**
 * MyProgramm to add, update and render GraphicElements
 * @author Joshua Golde
 */

public class MyProgramm {
    public static void main(String[] args) {
        /*
          creates and fills ArrayList graphics
         */
        ArrayList<GraphicElement> graphics = new ArrayList<>();
        graphics.add(new GraphicElement(2,5));
        graphics.add(new GraphicElement(3,3));
        graphics.add(new GraphicElement(3,5));

        /*
          sets first Element of graphics to new value x=+3
         */
        graphics.set(0,new GraphicElement(graphics.get(0).getX() +3,5));

        /*
          prints out all Elements of graphics in the terminal
         */
        for (GraphicElement g: graphics){
            g.render();
        }




    }
}
