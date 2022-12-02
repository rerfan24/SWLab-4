public class Rectangle extends Shape{
    private int width;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int area() {
        return this.length * this.width;
    }
}
