package com.longdatech.decryptcode;

import java.util.HashMap;
import java.util.Map;

public class TestVolatile<K,V> {

	static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;

	static final float DEFAULT_LOAD_FACTOR = 0.75f;

	static final int TREEIFY_THRESHOLD = 8;


	public static void main(String[] args) {
		Map map = new HashMap();
		map.size();

		ThreadDemo td = new ThreadDemo();
		new Thread(td).start();
		while(true){
			if(td.isFlag()){
				System.out.println("------------------");
				break;
			}
		}
	}
}
class ThreadDemo implements Runnable {
	private  boolean flag = false;
	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		flag = true;
		System.out.println("flag=" + isFlag());
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
