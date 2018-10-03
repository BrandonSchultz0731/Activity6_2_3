public class Main {

  public static void main(String[] args) {
    Cuboid<Double> c1 = new Cuboid<>();
    Map<Integer,String> m1 = new Map<>();
    Map<Integer,String> m2 = new Map<>();
    Map<Integer,String> m3 = new Map<>();
    m1.setKey(1989);
    m1.setValue("GT-R");
    m2.setKey(1969);
    m2.setValue("Capri");
    m3.setKey(1953);
    m3.setValue("Corvette C1");
    System.out.println(m1.toString());
  }
}
