import java.util.Arrays;
import java.util.Scanner;

// time complexity = O(n*logn)

public class KMaxMinArray {
    public static void main(String[] args) {
        int[] arr = {2,7,3,9,10};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of max value or min value you want : " );
        int n = sc.nextInt();

        Arrays.sort(arr);

        System.out.printf("%d Maximum number : %d  ", n , arr[arr.length-n]);
        System.out.printf("%d Minimum number : %d  ", n , arr[n-1]);

    }
}
