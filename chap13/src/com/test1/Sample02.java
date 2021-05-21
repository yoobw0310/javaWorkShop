package com.test1;		//¶÷´Ù½Ä

interface ICalculator {
	public  int add(int x, int y);
}

public class Sample02 {
	public static void main(String[] args) {
		ICalculator calc = 
				new ICalculator() {
			public int add(int a, int b) {
				return a + b;
			}
		};
		int c = calc.add(30, 50);
		System.out.println(c);
		
		ICalculator calc2 = (x, y) -> {
			return x + y;
		};
		int d = calc2.add(30,  100);
		System.out.println(d);
	}

}
