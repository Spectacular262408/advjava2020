package cn.tju.chp06.s02.annotation;

public class OverrideTest {
	
//	@Override
	public String toString() {
		return "Class";
	}
	
	

	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		System.out.println(test);
	}

}
