package graphics;

public class GraphicElement {
    int x;
    int y;

    public GraphicElement(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void render(){
        System.out.println("x: "+ x + " y: " + y);
    }

    public int getX() {
        return x;
    }
}
