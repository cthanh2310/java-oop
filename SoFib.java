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
public class SoFib {
    static Scanner sc = new Scanner(System.in);
    static int t, n;
    
    public static void main(String[] args) {
        t = sc.nextInt();
        while (t > 0) {
            t--;
            n = sc.nextInt();
            System.out.println(fib(n));
        }
    }
    
    static long fib(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        long x1 = 1, x2 = 1, res = 1;
        for (int i =3; i <= x; i++) {
            res = x1+x2;
            x1 = x2;
            x2 = res;
        }
        return res;
    }
}
