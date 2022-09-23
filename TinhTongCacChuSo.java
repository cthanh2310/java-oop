/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tungn
 */
public class TinhTongCacChuSo {
    static Scanner sc = new Scanner(System.in);
    static int t;
    static String str;
    
    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t>0) {
            t--;
            str = sc.nextLine();
            solve();
        }
    }
    
    static void solve() {
        ArrayList<String> arr = new ArrayList<>();
        int tong = 0;
        for (int i = 0; i <  str.length(); i++) {
            char c = str.charAt(i);
            if (Integer.valueOf(c) >= 48 && Integer.valueOf(c) <= 57) {
                tong += Integer.valueOf(String.valueOf(c));
            } else {
                arr.add(String.valueOf(c));
            }
        }
        Collections.sort(arr);
        
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
        System.out.println(tong);
    }
}
