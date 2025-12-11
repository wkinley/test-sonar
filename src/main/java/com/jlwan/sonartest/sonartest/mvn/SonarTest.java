/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jlwan.sonartest.sonartest.mvn;

import java.util.Random;

/**
 *
 * @author unm2000
 */
public class SonarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "a:b";
        //越界
        System.out.println(s.substring(0, s.lastIndexOf(":")));
        //空指针
        int b = getString(System.currentTimeMillis()).length();
        System.out.println(b);
    }

    public static String getString(long k) {
        if (k % 2 == 0) {
            return null;
        }
        return k + "";
    }

    public int lengthPlus(String str) {
        int len = 2;
        try {
            len += str.length();
        } catch (NullPointerException e) {
            System.out.println("argument was null");
        }
        return len;
    }
}
