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
public class ChuanHoaXauHoTen {
    static Scanner sc = new Scanner(System.in);
    static int t;
    static String s;
    
    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0) {
            t--;
            s = sc.nextLine().toLowerCase();
            s = s.trim().replaceAll("\\s+", " ");
//            System.out.println(s);
            String[] ss = s.split(" "); 
            s = "";
            for (int i = 0; i < ss.length; i++) {
                s += String.valueOf(ss[i].charAt(0)).toUpperCase() + ss[i].substring(1) + " ";   
            }
            System.out.println(s);
            
            
            
        }
    }
    
    
}
