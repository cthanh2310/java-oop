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
public class BCNN_SoNguyenLon {
    static Scanner sc = new Scanner(System.in);
    static String s1, s2;
    static int t;
    
    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            
            System.out.println(b1.multiply(b2).divide(b1.gcd(b2)));
            
        }
    }
}
