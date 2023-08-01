import java.util.Random;

public class Main {

  public static void main(String[] args) {
    int[] integers = new int[10];
    Random r = new Random();
    for (int i = 0; i < integers.length; i++) {
      int i1 = r.nextInt(10);
      System.out.println(i1);

    }
    System.out.println("Hello world!");
  }
}