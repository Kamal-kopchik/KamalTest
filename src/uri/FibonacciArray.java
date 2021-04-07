package uri;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, f;
        long arr[] = new long[61];
        n = input.nextInt();

        arr[0] = 0;
        arr[1] = 1;
        for(int j = 2; j <= 60; j++){
            arr[j] = arr[j-2] + arr[j-1];
        }

        for(int i = 0; i < n; i++){
            f = input.nextInt();
            System.out.printf("Fib(%d) = %d\n", f, arr[f]);
        }
    }

}
