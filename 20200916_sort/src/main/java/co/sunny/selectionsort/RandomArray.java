package co.sunny.selectionsort;

import java.util.Random;

public class RandomArray {
	private int[] initNum;
	
	public RandomArray(int n) {
		initNum = new int[n];
	}
	
	public int[] randNum() {
		Random rd = new Random();
		for(int i = 0; i < initNum.length; i++) {
			initNum[i] = rd.nextInt(1000) +1;
		}
		return initNum;
	}

}
