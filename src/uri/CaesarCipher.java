package uri;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        in.nextLine();
        for(int i=0;i<x;i++){

            char[] arr=in.nextLine().toCharArray();
            int n=in.nextInt();
            in.nextLine();

            for(int j=0;j<arr.length;j++){

                int a=(int)((arr[j])-n);

                if(a<65){
                    a+=26;
                }

                arr[j]=(char)a;
            }
            System.out.println(arr);
        } //HENLO
    }
}
