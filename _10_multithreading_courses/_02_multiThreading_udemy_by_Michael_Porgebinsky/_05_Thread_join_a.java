package _10_multithreading_courses._02_multiThreading_udemy_by_Michael_Porgebinsky;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_Thread_join_a {

	public static void main(String[] args) {
		List<Long> inputNumbers = Arrays.asList(0L, 3435L, 2324L, 4656L, 23L, 5556L);
		
		List<FactorialThread> tList = new ArrayList<>();
		for(Long l : inputNumbers) {
			tList.add(new FactorialThread(l));
		}
		
		for(FactorialThread t : tList) {
			t.start();
			try {
//				t.join();// this can cause main thread to wait for long
				t.join(2000L);
//				t.setDaemon(true); // if we want to end all thread as soon as main ends
			} catch (InterruptedException e) { }
		}
		
		for(FactorialThread t : tList)
			if(t.isFinished)
				System.out.println("factorial of "+t.getInputNumber()+
						" is "+t.getResult());
			else
				System.out.println("calculation for number "+t.getInputNumber()+
						" still in progress");
	}
	
	private static class FactorialThread extends Thread{
		final private long inputNumber;
		private BigInteger result= BigInteger.ONE;
		private boolean isFinished=false;
		
		public FactorialThread(long i) {
			this.inputNumber = i;	
		}
		@Override
		public void run() {
			this.result = calcFactorial(inputNumber);
			this.isFinished=true;
		}
		
		private BigInteger calcFactorial(long inputNumber2) {
			BigInteger temp= BigInteger.ONE;
			for(long i=1L; i<=inputNumber;i++)
				temp= temp.multiply(BigInteger.valueOf(i));
			
			return temp;
		}
		public long getInputNumber() {
			return inputNumber;
		}
		public BigInteger getResult() {
			return result;
		}
		public boolean isFinished() {
			return isFinished;
		}
		
	}
}
