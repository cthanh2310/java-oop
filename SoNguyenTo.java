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
public class SoNguyenTo {
    static Scanner sc = new Scanner(System.in);
    static int t;
    
    public static void main(String[] args) {
        t = Integer.valueOf(sc.nextLine());
        while (t > 0 ) {
            t--;
            if (isPrime(sc.nextInt())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}
