package uri;

import java.util.Scanner;

public class Sequence1 {
    public static void main(String[] args) {
        for(int i=1,j=60;j>=0;i+=3,j-=5){
            System.out.printf("I=%d J=%d\n",i,j);
        }
    }
}
