/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import java.util.Scanner;

/**
 *
 * @author tungn
 */
public class BCNN_UCLN {

    static long t, a, b, ucln;
    static long bcnn;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            a = sc.nextInt();
            b = sc.nextInt();
            ucln = gcd(a, b);
            bcnn = a*b/ucln;
            
            System.out.println(bcnn + " " + ucln);
        }
    }

    static long gcd(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
}
