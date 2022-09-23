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
public class SapXepChon {
    static int n;
    static int[] a = new int[105];
    static Scanner sc = new Scanner(System.in);
    
    static void swap(int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    public static void main(String[] args) {
        n = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(i, min);
            
            String str = "Buoc " + String.valueOf(i+1) + ": ";
            for (int k = 0; k < n; k++) {
                str += String.valueOf(a[k]) + " ";
            }
            System.out.println(str);
            
        }
    }
}
