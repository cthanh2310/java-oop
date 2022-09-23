/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author tungn
 */
public class DiaChiEmail {
    static Scanner sc = new Scanner(System.in);
    static int t;
    static String s;
    
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            s = sc.nextLine().toLowerCase();
            s = s.trim().replaceAll("\\s+", " ");
            String[] ss = s.split(" "); 
            s = ss[ss.length-1];
            for (int i = 0; i < ss.length - 1; i++) {
                  s += String.valueOf(ss[i].charAt(0));
            } 
            
            int n = set.size();
            set.add(s);
            
            if (set.size() > n) {
                System.out.println(s + "@ptit.edu.vn");
                continue;
            }
            
            int x = 1;
            while (set.size() == n) {
                x++;
                set.add(s + x);
 
            }
            System.out.println(s+x + "@ptit.edu.vn");
            
            
        }
    }
    
    
}
