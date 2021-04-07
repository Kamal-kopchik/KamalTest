package uri;

import java.util.Scanner;

public class DancingSentence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S1 = in.nextLine();
        char[]arr=S1.toCharArray();
        for (int i=0;i< arr.length;i++) {
            if(arr[i]>='A' && arr[i]<='Z'){
                if(i%2==0) {
                    int a = arr[i] + 32;
                    arr[i] = (char) a;
                }
            }
            else if(arr[i]>='a' && arr[i]<='z'){
                if(i%2==0) {
                    int a = arr[i] - 32;
                    arr[i] = (char) a;
                }
            }

        }
        System.out.println(arr);
    }
}
