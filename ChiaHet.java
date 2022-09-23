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
public class ChiaHet {

    static Scanner sc = new Scanner(System.in);
    static String s1, s2;
    static int t;

    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            String tmp = sc.nextLine();
            String[] ss = tmp.split(" ");
            s1 = ss[0];
            s2 = ss[1];
            
            
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);

            
            if(b1.mod(b2).toString().equals("0") || b2.mod(b1).toString().equals("0")) {
               
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
