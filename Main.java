

@FunctionalInterface
interface I{
  public final int x = 1;
  void m1(int x);
}


class Main {
  public static void main(String[] args) {

    I i1 = (x) -> System.out.println("Lambda Expression implemention instead of Anonymous Inner class - " + x);
    i1.m1(i1.x);
    System.out.println("Hello world!");
    
  }
}