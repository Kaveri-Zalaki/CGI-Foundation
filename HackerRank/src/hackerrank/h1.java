/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.*;
import java.io.*;
import java.lang.Math;

/**
 *
 * @author KAVERI
 */
public class h1 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        int calc=a;
        for(int j=0;j<n;j++){
         calc+=(Math.pow(2,j)*b);
        System.out.print(calc+" ");
        }
        System.out.println();}
    
    in.close();
        
}}

