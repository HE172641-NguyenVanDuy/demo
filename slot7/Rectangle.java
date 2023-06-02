
package data;


public class Rectangle {
    private int length = 0;
    private int width = 0;

    public Rectangle() {
    }
    
    public Rectangle(int l, int w){
        length = l> 0? 1:0;
        width =  w>0? w:0;
        
    }
    
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    public int getArea() {
        return width * length;
    }
           
}
