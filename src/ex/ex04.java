﻿package ex;
/*
 * Topic: 撰寫一函數void square(arr)，在呼叫square(arr)函數後，
 * 一維陣列arr裡的每一個元素皆會被平方。
 * 例如:輸入1 3 5 7, 則輸出1  9   25  49
 * Date: 2016/10/31
 * Author: 103021043 何宙運
 */
import java.util.Scanner;
public class ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		String arr=scn.next();
		square(arr);
		}
		
	private static void square(String arr){
		char data[]=arr.toCharArray();
		int lan=data.length;
		for(int i=0;i<lan;i++){
		System.out.print(" "+(Integer.parseInt(data[i]+"")*Integer.parseInt(data[i]+"")));
			}
	
		}

	



	}


