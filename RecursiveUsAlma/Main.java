package RecursiveUsAlma;

import java.util.Scanner;

public class Main {

    static int exponent(int a,int b){
        if (b == 0){
            return 1;
        }else if (b == 1){
            return a;
        }
        return a * exponent(a,b-1);
    }

    public static void main(String[] args) {
        int taban,us;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        taban = scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        us = scan.nextInt();

        System.out.println("Sonuç : " + exponent(taban,us));
    }
}
