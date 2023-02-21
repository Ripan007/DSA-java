// import java.util.Arrays;

public class maxValue {
  public static void main(String[] args) {
    // System.out.println("welcome to maxValue");
    int num[] = { 10, 20, 30, 40, 50 };
    // System.out.println(Arrays.toString(num));
    System.out.println(max(num));
  }

  static int max(int[] num) {
    int maxValue = num[0];
    for (int i = 1; i < num.length; i++) {
      if (num[i] > maxValue) {
        maxValue = num[i];
      }
    }
    return maxValue;

  }
}
