package cn.tju.chp08.s04.synchronize;

public class SyncTwoMethod1 implements Runnable{
	@Override
	public void run() {
		try {
			m1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void m1() throws InterruptedException {
		System.out.println("被synchronized修饰，线程名：" + Thread.currentThread().getName());
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + " 执行完毕");
	}
			
	public static void main(String[] args) throws InterruptedException {
		SyncTwoMethod1 stm = new SyncTwoMethod1(); 
		Thread t1 = new Thread(stm);
		Thread t2 = new Thread(stm);
		t1.start();
		t2.start();		
	}

	

}
