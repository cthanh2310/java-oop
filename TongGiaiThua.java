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
public class TongGiaiThua {
    static int n;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        n = sc.nextInt();
        
        long s = 1;
        long x = 1;
        for (int i = 2; i<=n; i++) {
            x = x*i;
            s += x;
        }
        
        System.out.println(s);
    }
}
