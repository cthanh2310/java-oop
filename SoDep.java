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
public class SoDep {
    static Scanner sc = new Scanner(System.in);
    static String s;
    static int t;
    
    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            s = sc.nextLine();
            
            if (ok()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
            
        }
    }
    
    static boolean ok() {
        int i = 0, j = s.length()-1;
        
        while (i <= j) {
            int a = Integer.valueOf(String.valueOf(s.charAt(i)));
            int b = Integer.valueOf(String.valueOf(s.charAt(j)));
            
            if (a%2!=0 || b%2!=0 || a!=b) {
                return false;
            }
            
            i++;j--;
        }
        
        return true;
    }
}
