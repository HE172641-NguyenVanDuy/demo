package data;

public class Box extends Rectangle {

    private int height;

    public Box(int h, int l, int w) {
        super(l, w);
        height = h > 0 ? h : 0;
    }

    @Override
    public int getArea() {
        int h = this.getHeight();
        int w = this.getWidth();
        int l = this.getLength();
        return 2 * (h * l + w * l + w * h);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int volumn() {
        return this.getLength() * this.getWidth() * height;
    }
    @Override
    public String toString() {
        return "Box{" + "height=" + height + '}';
    }

}
