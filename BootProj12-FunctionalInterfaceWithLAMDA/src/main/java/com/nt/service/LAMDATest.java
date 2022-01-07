package com.nt.service;

public class LAMDATest {

	public static void main(String[] args) {
 //style-1 
		
/*		Arithmatic ar=(int a,int b) ->{
			int c=a+b;
			return c;
		};
		System.out.println("sum::"+ar.add(10,20)); */
		
		//Style-2
		/*Arithmatic ar=(int a,int b) ->{
			
			return a+b ;
		};
		System.out.println("sum::"+ar.add(10,20));*/
		
		//Style-3
		/*
		Arithmatic ar=(int a,int b) ->a+b;
			System.out.println("sum::"+ar.add(10,20)); */
		//Style-4
		/*
		Arithmatic ar=( a , b) ->a+b;
		System.out.println("sum::"+ar.add(10,20)); */
		
		//Parameter change
		/*
		Arithmatic ar=(x, y) ->x+y;
		System.out.println("sum::"+ar.add(10,20));*/
	} 

}
