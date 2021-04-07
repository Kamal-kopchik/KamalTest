package uri;

import java.util.Scanner;

public class One_Two_Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcases=in.nextInt();
        in.nextLine();
        for(int i=0;i<testcases;i++){
            char[] arr=in.nextLine().toCharArray();
                    if(arr[0]=='o' && arr[1]=='n' || arr[0]=='o' && arr[2]=='e' || arr[1]=='n' && arr[2]=='e'){
                        System.out.println(1);
                    }
                    else if(arr[0]=='t' && arr[1]=='w' || arr[0]=='t' && arr[2]=='o' || arr[1]=='w' && arr[2]=='o'){
                        System.out.println(2);
                    }
                    else if(arr.length==5){
                        System.out.println(3);
                    }
                }
        }
    }

