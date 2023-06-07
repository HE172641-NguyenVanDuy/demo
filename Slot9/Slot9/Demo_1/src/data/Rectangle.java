
package data;


public class Rectangle {
    protected int length, width;
    public void setValue(int l) {
        length = l>0?1:0;
    }
    public  void setValue(int l, int w) {
        length  = l>0?1:0;
        width = w>0?w:0;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
    
}
