/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tungn
 */
public class RutGonXauKyTu {
    static Scanner sc = new Scanner(System.in);
    static String s;
    
    public static void main(String[] args) {
        s = sc.nextLine();
        boolean ok = true;
        String ss[] = s.split("");
        ArrayList<String> arr = new ArrayList<>(ss);
        
        while (ok) {
            ok = false;
            for (int i = 0; i < arr.size() - 1; i++) {
                if (arr.get(i).equals(arr.get(i+1))) {
                    ok = true;
                    arr.remove(i);
                    arr.remove(i);
                }
            }
        }
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}
