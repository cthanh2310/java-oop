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
public class DanhDauChuCai {
    static Scanner sc = new Scanner(System.in);
    static String str;
    
    public static void main(String[] args) {
        str = sc.nextLine();
        TreeSet<String> set = new TreeSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            set.add(str.substring(i, i+1));
        }
        
        System.out.println(set.size());
    }
}
