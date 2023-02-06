package _10_multithreading_courses._02_multiThreading_udemy_by_Michael_Porgebinsky;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class _03_Vault_Hacker_Police_Game {
	public static final int MAX_PASSWORD=9999;
	public static void main(String[] args) {
		
		Vault vault = new Vault(new Random().nextInt(MAX_PASSWORD));
		List<Thread> tList = new ArrayList<>();
		tList.add(new AscendingHackerThread(vault));
		tList.add(new DescendingHackerThread(vault));
		tList.add(new PoliceThread());
		
		for(Thread t : tList)
			t.start();
		
	}
	
	private static class Vault{
		private final int password;
		public Vault(int pass) {
			this.password=pass;
		}
		public boolean isPasswordCorrect(int guess) {
			try {
				Thread.sleep(5L);
			} catch (InterruptedException e) { }
			return this.password==guess;
		}
	}

	private static abstract class HackerThread extends Thread{
		protected Vault vault;

		public HackerThread(Vault vault) {
			this.vault=vault;
			this.setName(this.getClass().getSimpleName());
			this.setPriority(MAX_PRIORITY);
		}

		@Override
		public void start() {
			System.out.println("Starting thread: "+this.getName());
			super.start();
		}
	}

	private static class AscendingHackerThread extends HackerThread{
		public AscendingHackerThread(Vault vault) {
			super(vault);
		}
		@Override
		public void run() {
			for(int guess=1; guess <= MAX_PASSWORD;guess++) {
				if(vault.isPasswordCorrect(guess)) {
					System.out.println(this.getName()+
							" guessed the password "+guess);
				System.exit(0);
				}
			}
		}
	}
	private static class DescendingHackerThread extends HackerThread{
		public DescendingHackerThread(Vault vault) {
			super(vault);
		}
		@Override
		public void run() {
			for(int guess=MAX_PASSWORD; guess >=0; guess--) {
				if(vault.isPasswordCorrect(guess)) {
					System.out.println(this.getName()+
							" guessed the password "+guess);
				System.exit(0);
				}
			}
		}
	}

	private static class PoliceThread extends Thread{
		@Override
		public void run() {
			for(int i=10;i> 0;i--) {
				try {
					Thread.sleep(1000L);
				} catch (InterruptedException e) { }

				System.out.println(i);
			}

			System.out.println("game over for you hackers");
			System.exit(0);
		}
	}
}
