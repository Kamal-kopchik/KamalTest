package uri;

import java.util.Scanner;

public class Encryption {
    static char[] arr;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcases = input.nextInt();
        input.nextLine();
        for (int i = 0; i < testcases; i++) {
            arr = input.nextLine().toCharArray();
            rshift();
            reverse();
            lshift();
            System.out.println(String.copyValueOf(arr));
        }
    }

    static void reverse() {
        int last = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
            last--;
        }
    }

    static void rshift() {
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] += 3;
            }
        }
    }

    static void lshift() {
        for (int i = arr.length / 2; i < arr.length; i++) {
            arr[i] -= 1;
        }
    }
}

