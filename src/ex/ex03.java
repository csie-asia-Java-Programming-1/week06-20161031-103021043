﻿package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。
 * 例如:輸入128917178,則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入一串數字");
			String n=scn.next();
			decomp(n);
	}	
private static void decomp(String n){
	char data[]=n.toCharArray();
	System.out.print(data[0]+" ");
	for(int i=1;i<data.length;i++){
		System.out.print(data[i]+" ");
	}
  }
}