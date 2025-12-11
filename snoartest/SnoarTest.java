/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snoartest;

/**
 *
 * @author unm2000
 */
public class SnoarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "a:b";
        System.out.println(s.substring(0, s.lastIndexOf(":")));
    }
    
}
