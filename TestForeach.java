import java.util.ArrayList;
import java.util.List;

public class TestForeach {

	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("abc");
		str.add("def");
		str.add("ghi");
		
		
		for (String string : str) {
			System.out.println(string);
		}
	}
}
