package graphics;

/**
 * GraphicElement with x and y coordinates
 * @author Joshua Golde
 */

public class GraphicElement {

    int x;
    int y;

    /**
     *
     * @param x x-coordinate of graphicElement
     * @param y y-Coordinate of graphicElement
     */
    public GraphicElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * prints x- and y- coordinate into terminal
     */
    public void render(){
        System.out.println("x: "+ x + " y: " + y);
    }

    /**
     *
     * @return x-coordinate of graphicElement
     */
    public int getX() {
        return x;
    }
}
