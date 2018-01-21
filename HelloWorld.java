import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelloWorld {

	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println("Hello");
		}
		List<String> str=new ArrayList<String>();
		str.add("abc");
		str.add("def");
		str.add("ghi");
		
		System.out.println("Time stamp works");
		
		for (String string : str) {
			System.out.println(string);
		}
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Test time stamp");
		
		try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i=10;
		while(i>=0){
			System.out.println(i);
			i--;
		}
	}
}
