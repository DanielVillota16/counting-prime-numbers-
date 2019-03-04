package ui;

import model.CountingPrimeNumbers;

public class WithoutExtraThreadsMain {

	public static void main(String[] args) {
		int start = 0;
		int end = 10000000;
		CountingPrimeNumbers cpn1 = new CountingPrimeNumbers(start, end);
		long startTime = System.currentTimeMillis();
		cpn1.count();
		long endTime = System.currentTimeMillis();
		int output = cpn1.getTotal();
		System.out.println("Total prime numbers between "+ start +" and "+end+": " +output);
		System.out.println("Final time: " + (endTime-startTime));

	}

}
