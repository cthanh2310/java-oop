/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author tungn
 */
public class SoKhongLienKe {
    static Scanner sc = new Scanner(System.in);
    static String number;
    static int t;
    
    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            number = sc.nextLine();
            
            if (ktr()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    static boolean ktr() {
        int tong = Integer.valueOf(number.charAt(0)) -48;
        for (int i = 0; i < number.length() - 1; i++) {
            int a = Integer.valueOf(number.charAt(i))-48;
            int b = Integer.valueOf(number.charAt(i+1))-48;
            if (abs(a-b) != 2) {
                return false;
            }
            tong = (tong+b)%10;
//            System.out.println(a + " " + b + " " + tong);
        }
        if (tong % 10 == 0) {
            return true;
        }
        return false;
    }
}
 