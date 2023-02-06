package _10_multithreading_courses._02_multiThreading_udemy_by_Michael_Porgebinsky;

import java.math.BigDecimal;
import java.math.BigInteger;

public class _04_Thread_interrupt_b {

	public static void main(String[] args) {
		
		LongComputationThread r = 
				new LongComputationThread(BigInteger.valueOf(2), BigInteger.valueOf(5));
		Thread t1 = new Thread(r);
		t1.start();
		
		t1.interrupt();// if we are not handling InterruptedException then we
					  // can manually check for isInterrupted() signal
	}
	
	private static class LongComputationThread implements Runnable{
		private final BigInteger base;
		private final BigInteger power;
		
		public LongComputationThread(BigInteger base, BigInteger power) {
			this.base=base;
			this.power=power;
		}
		public void run() {
			System.out.println(base+"^"+power+" = "+pow(base,power));
		}
		private BigInteger pow(BigInteger base, BigInteger power) {
			BigInteger result=BigInteger.ONE;
			for(BigInteger i=BigInteger.ZERO; i.compareTo(power)!=0;i=i.add(BigInteger.ONE)) {
				if(Thread.currentThread().isInterrupted()) {
					System.out.println("prematurely interrupted coputation");
					return BigInteger.ZERO;
				}
				result.multiply(base);
			}
			return result;
		}
	}
}
