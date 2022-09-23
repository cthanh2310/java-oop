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
public class SoLienKe {
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
        for (int i = 0; i < number.length() - 1; i++) {
            int a = Integer.valueOf(number.charAt(i));
            int b = Integer.valueOf(number.charAt(i+1));
            if (abs(a-b) != 1) {
                return false;
            }
        }
        return true;
    }
}
