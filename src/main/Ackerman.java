package main;

public class Ackerman {
  
  public static void main(String[] args) {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        int ack = ack(i,j);
        System.out.println("ackerman (" + i + "," + j + ") is: " + ack);
      }
    }
  }

  public static int ack(int m, int n) {
    int result;
    if (m == 0) result = n + 1;
    else if (n == 0) result = ack(m - 1, 1);
    else result = ack(m - 1, ack(m, n - 1));
    return result;
  }
}
