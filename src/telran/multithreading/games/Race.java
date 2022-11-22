package telran.multithreading.games;

import java.util.concurrent.atomic.AtomicInteger;


public class Race {
	private int distance;
	private int minSleep;
	private int maxSleep;
	//private int winner = -1;
	private static AtomicInteger winner = new AtomicInteger();
	public Race(int distance, int minSleep, int maxSleep) {
		this.distance = distance;
		this.minSleep = minSleep;
		this.maxSleep = maxSleep;
	}
	public int getWinner() {
		return winner.get();
	}
	public void startWinner(int win) {
		
			winner.addAndGet(win);
		}
	public void setWinner(int win) {
		if (winner.get() == -1) {
			winner.addAndGet(win);
		}
	}
	public int getDistance() {
		return distance;
	}
	public int getMinSleep() {
		return minSleep;
	}
	public int getMaxSleep() {
		return maxSleep;
	}
	
}
