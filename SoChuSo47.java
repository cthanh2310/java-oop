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
public class SoChuSo47 {
    static String number;
    static int count = 0;
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        number = sc.nextLine();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '4' || number.charAt(i) == '7') {
                count++;
            }
        }
        if (count == 4 || count ==7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
