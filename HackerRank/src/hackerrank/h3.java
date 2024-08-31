/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author KAVERI
 */
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class h3 {


    static int B;
    static int H;
    static boolean flag=false;
    static {
    Scanner sc=new Scanner(System.in);
    B=sc.nextInt();
    H=sc.nextInt();
    try{
    if(B<=0 || H<=0){
    throw new Exception("Breadth and height must be positive");
    }
    flag=true;
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
