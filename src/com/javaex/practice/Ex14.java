package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
				
				System.out.println("수익을 입력해 주세요");
				System.out.print("금익: ");
				double profit = sc.nextDouble();
				
				double under4 = 1000*0.09 + 0.18*(profit-1000);
				double under8 = 1000*0.09 + 3000*0.18 + 0.27*(profit-4000);
				double over8 = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(profit-8000);
				
					
					if(1000 >= profit && profit >= 0) {
						System.out.println("소득세는 " + 0.09*profit + " 입니다.");
					}
					else if(4000 >= profit && profit > 1000) {
						System.out.println("소득세는 " + under4 + " 입니다.");
					}
					else if(8000 > profit && profit > 4000) {
						System.out.println("소득세는 " + under8 + " 입니다.");
					}
					else if(profit >= 8000 ) {
						System.out.println("소득세는 " + over8 + " 입니다.");
					}
					else {
						System.out.println("잘못 입력했습니다.");
					}

			sc.close();
		}
}
