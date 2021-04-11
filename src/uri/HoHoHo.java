package uri;

import java.util.Scanner;

public class HoHoHo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cnt=0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ho ");
            if(cnt==n-1){
                System.out.print("Ho ");
            }
        }
        System.out.println("!");
    }
}

