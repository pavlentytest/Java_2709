package example2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag; // описание переменной
        flag = false;
        //flag = 1;
        char ch = 'A';
        ch = '1';
        // ch = "String";
        int a = 100;
        long b = 200L;
        a = (int) b;
        b = a;
        float f1 = 5.67F;
        double d1 = 5.45;
        d1 = f1;
        f1 = (float)d1; // явное приведение

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.UK);
        double y = scan.nextDouble();
        System.out.println(y); // sout - shortcut

        // / - операция цел. деления
        // % - остаток от деления
        System.out.println(4/3); // 1
        System.out.println(4.0/3); // 1.33333
        System.out.println(4%3); // 1


    }
}
