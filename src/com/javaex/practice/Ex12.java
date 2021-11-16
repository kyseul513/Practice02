package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("출력되는 내용을 입력하세요");
			System.out.print("기호: ");
				String str = sc.nextLine();
				
			System.out.print("숫자1: ");
				double n1 = sc.nextDouble();
				
			System.out.print("숫자2: ");
				double n2 = sc.nextDouble();
				
			double plus = n1+n2;
			double minus = n1-n2;
			double mul = n1*n2;
			double div = n1/n2;
					
			switch(str) {
				case "+":
					System.out.println("결과는: " + plus);
				break;
				
				case "-":
					System.out.println("결과는: " + minus);
				break;
				
				case "*":
					System.out.println("결과는: " + mul);
				break;
				
				case "/":
					System.out.println("결과는: " + div);
				break;
				
				default:
					System.out.println("계산할 수 없는 기호입니다.");
				break;
			}
				
		sc.close();
	}

}
