package org.young.jvm.ch11;

/**
 * 代码清单 11-2
 *
 * @author by Young.ZHU
 *      on 2014年8月10日
 *
 * Package&FileName: org.young.jvm.ch11.Test
 */
public class Test {

	public static final int NUM = 15000;
	
	public static int doubleValue(int i) {
		// 空循环，用于演示JIT 代码优化过程
		for(int j = 0;  j < 100000; j ++);
		return i * 2;
	}
	
	public static long calcSum() {
		long sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += doubleValue(i);
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < NUM; i++) {
			calcSum();
		}
	}
}
