package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해 주세요");
			System.out.print("숫자: ");
			double no = sc.nextDouble();
			
			double under0 = no*no*no-9*no+2;
			double over0 = 7*no+2;
			
				if (no > 0) {
					System.out.println("계산결과는 " + over0 + " 입니다.");
				}
				else {
					System.out.println("계산결과는 " + under0 + " 입니다.");
				}
		
		sc.close();
	}
}
