/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author tungn
 */
public class GiaoCua2DaySo {
    static Scanner sc = new Scanner(System.in);
    static int n, m;
    
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        TreeSet<Integer> set2 = new TreeSet<>();
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            set1.add(sc.nextInt());
        }
        
        for (int i = 0; i < n; i++) {
            set2.add(sc.nextInt());
        }
        
        set1.retainAll(set2);
        
        List<Integer> list = new ArrayList<Integer>(set1);
        Collections.sort(list);
        
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str += list.get(i) + " ";
        }
        System.out.println(str);
        
    }
}
