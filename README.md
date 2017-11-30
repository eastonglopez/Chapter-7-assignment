import java.util.*;

public class reverse {
  public static void main(String[] args) {
    Integer arr[] = {8, 10, 15, 99, 77, 16, 5, 109};
    System.out.println("Original Array : " + Arrays.toString(arr));
    Collections.reverse(Arrays.asList(arr));
    System.out.println("Modified Array : " + Arrays.toString(arr));
  }
}
