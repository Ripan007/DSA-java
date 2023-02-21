import java.util.Arrays;

public class Reverse {
  public static void main(String[] args) {
    // System.out.println("welcome");
    int[] num = { 10, 20, 30, 40 };
    reverse(num);
    System.out.println(Arrays.toString(num));

  }

  static void reverse(int[] num) {
    int start = 0;
    int end = num.length - 1;

    while (start < end) {
      swap(num, start, end);
      start++;
      end--;
    }

  }

  static void swap(int[] num, int index, int index1) {
    int temp = num[index];
    num[index] = num[index1];
    num[index1] = temp;

  }

}
