package cn.tju.chp07.s01.jvm;


class Sample{
	private String name;
	public Sample(String name){
		this.name = name;
	}
	
	public void printName(){
		System.out.println(name);
	}
}


public class AppMain {

	public static void main(String[] args) {
		Sample test1 = new Sample("Test 1");
		Sample test2 = new Sample("Test 2");
		
		test1.printName();
		test2.printName();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
