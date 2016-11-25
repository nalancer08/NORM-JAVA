package helloWorld;

import com.google.common.base.CaseFormat;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		String test = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, "SomeInput");
		System.out.println(test);
		
	}

}
