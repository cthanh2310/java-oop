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
public class SapXepChen {
    static int n;
    static ArrayList<Integer> arr =  new ArrayList<Integer>();
    static int[] a = new int[105];
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        n = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            arr.add(a[i]);
            Collections.sort(arr);
            
            String str = "Buoc " + String.valueOf(i) + ": ";
            for (int j = 0; j <= i; j++) {
                str += arr.get(j) + " ";
            }
            System.out.println(str);
        }
    }
    
}
