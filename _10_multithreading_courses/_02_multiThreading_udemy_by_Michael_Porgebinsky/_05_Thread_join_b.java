package _10_multithreading_courses._02_multiThreading_udemy_by_Michael_Porgebinsky;

import java.math.BigInteger;

public class _05_Thread_join_b {
	
	public static void main(String[] args) {
		BigInteger result = calculateResult(BigInteger.valueOf(2),
						BigInteger.valueOf(5),
						BigInteger.valueOf(10),
						BigInteger.valueOf(2));
		System.out.println(result);
	}
    public static  BigInteger calculateResult(BigInteger base1, BigInteger power1, BigInteger base2, BigInteger power2) {
        BigInteger result;
        PowerCalculatingThread t1 = new PowerCalculatingThread(base1, power1);
        PowerCalculatingThread t2 = new PowerCalculatingThread(base2, power2);
        
        t1.start();
        t2.start();
        
        try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) { }
        result = t1.getResult().add(t2.getResult());
        return result;
    }

    private static class PowerCalculatingThread extends Thread {
        private BigInteger result = BigInteger.ONE;
        private BigInteger base;
        private BigInteger power;
    
        public PowerCalculatingThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }
    
        @Override
        public void run() {
        	this.result = calcPow(base,power);
        }
        
    
        private BigInteger calcPow(BigInteger base, BigInteger power) {
        	BigInteger temp= BigInteger.ONE;
        	for(long i=0;i< power.longValue();i++) {
        		temp=temp.multiply(base);
        	}
        	System.out.println(base+" "+power+" "+temp);
        	return temp;
		}

		public BigInteger getResult() { return result; }
    }
}