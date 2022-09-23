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
public class UocNguyenToLonNhat {

    static Scanner sc = new Scanner(System.in);
    static int t;
    static long n;

    public static void main(String[] args) {
        t = sc.nextInt();
        while (t > 0) {
            t--;
            n = sc.nextLong();
            
            solve();
        }
    }
    
    static void solve() {
        long res = -1;
        
        while (n%2==0) {
            res = 2;
            n/=2;
        }
        
        for (int i = 3; i < Math.sqrt(n); i+=2) {
            while (n % i == 0) {
                res = i;
                n/=i;
            }
        }
        
        if (n > 2) {
            res = n;
        }
        
        System.out.println(res);
    }
}
