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
public class HieuSoNguyenLon {
    static Scanner sc = new Scanner(System.in);
    static String s1, s2;
    
    public static void main(String[] args) {
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);
        
        System.out.println(b1.subtract(b2));
                
            
    }
}
