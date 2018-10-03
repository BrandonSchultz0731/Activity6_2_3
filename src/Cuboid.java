public class Cuboid<T extends Number> {

  private T length;
  private T breadth;
  private T height;

  public T getLength() {
    return length;
  }

  public void setLength(T length) {
    this.length = length;
  }

  public T getBreadth() {
    return breadth;
  }

  public void setBreadth(T breadth) {
    this.breadth = breadth;
  }

  public T getHeight() {
    return height;
  }

  public void setHeight(T height) {
    this.height = height;
  }

  public double getVolume(){
    return length.doubleValue() * breadth.doubleValue() * height.doubleValue();
  }
  public String toString() {
    return "Cuboid{" +
        "length=" + length +
        ", breadth=" + breadth +
        ", height=" + height +
        '}';
  }
}
