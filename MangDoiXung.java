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
public class MangDoiXung {

    static int n, t;
    static int[] a = new int[105];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        t = sc.nextInt();
        while (t > 0) {
            t--;
            n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            if (ktr()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    static boolean ktr() {
        int j = 0, k = n - 1;
        while (j <= k) {
            if (a[j] != a[k]) {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}
