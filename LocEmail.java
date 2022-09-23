/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author tungn
 */
public class LocEmail {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNextLine()) {
            set.add(sc.nextLine().toLowerCase());
        }
        ArrayList<String> a = new ArrayList<>(set);
        Collections.sort(a);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
