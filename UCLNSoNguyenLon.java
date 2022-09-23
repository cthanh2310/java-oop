/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author tungn
 */
public class UCLNSoNguyenLon {
    static Scanner sc = new Scanner(System.in);
    static int t;
    static String s1, s2;
    
    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            solve();
        }
    }
    
    static void solve() {
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        BigInteger result = b1.gcd(b2);
        System.out.println(result);
    }
}
