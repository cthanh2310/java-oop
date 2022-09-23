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
public class ThuGonDaySo {
    static int n;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] agrs) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        boolean ok = true;
        while (ok) {
            ok = false;
            for (int i = 0; i < a.size() - 1; i++) {
                int tmp = a.get(i) + a.get(i+1);
                if (tmp%2 == 0) {
                    a.remove(i);
                    a.remove(i);
                    ok = true;
                } 
            }
        }
        
        System.out.println(a.size());
    }
}
