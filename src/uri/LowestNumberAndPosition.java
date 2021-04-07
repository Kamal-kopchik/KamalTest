package uri;

import java.util.Scanner;

public class LowestNumberAndPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [] arr=new int[n];
        int min=1000000000,index = 0;
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }

        }
        System.out.printf("Menor valor: %d\n",min);
        System.out.printf("Posicao: %d\n",index);
    }
}
