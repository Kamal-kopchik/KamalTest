package uri;

import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        for (; n > 0; n--) {
            String s1 = in.next().trim();
            String s2 = in.nextLine().trim();

            String result = f(s1, s2);
            System.out.println(result);
        }
    }

    static String f(String s1, String s2) {
        String s = "";

        int shortestlength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < shortestlength; i++) {

            s += s1.charAt(i);
            s += s2.charAt(i);
        }

        return s + (s1.length() > s2.length() ? s1.substring(shortestlength) : s2.substring(shortestlength));
    }
}

