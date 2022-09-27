package example1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] words = str.split(",");

        int y = scan.nextInt();
        int z = scan.nextInt();
        int c = y + z;
        System.out.println("Результат:"+c);
        System.out.println(y + " " + z);


        int i = 0;
        y = ++i; // y = 1, i = 1
        System.out.println("y="+y);
        z = i++; // z = 1, i = 2
        System.out.println("z="+y);

        if(z>123 && y==1 || c < -1) {

        } else if (1==1) {
            // логика
        } else {

        }
        int p = 1;
       // double d = 1.2;
        switch(p) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("Default");

        }
        // сюда
    }
}
