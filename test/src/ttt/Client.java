package ttt;

import java.util.Scanner;

import ttt.translate;

public class Client {
	public static void main(String[] args) {
		System.out.println(isStringToNumber("/"));
	}
	
    public static boolean isStringToNumber(String s) {
        try {
            String[] ss = s.split("");

            if(ss[ss.length-1].equals(".")) {
            	System.out.println("111");
                return false;
            }else {
                Double.parseDouble(s);
                System.out.println("222");
                return true;
            }
        } catch (Exception e) {
           System.out.println("333");
            return false;
        }
    }
}
