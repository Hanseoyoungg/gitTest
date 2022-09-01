import java.util.ArrayList;
import java.util.List;

class Word {
	List<String> s = new ArrayList<>();
	
	public void printAll() {
		System.out.println("All");
		for (int i = 0; i < s.size(); i++) {
			print(i);
		}
	}
	public void print (int i) {
		System.out.println("Word:" + s.get(i));
	}
	public void fillup() {
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
	}
}

public class example extends Word{
	public void printAll() {
		System.out.println("BigAll");
		super.printAll();
	}
	public void print(int i) {
		System.out.print("Big");
		super.print(i);
	}
	public static void main(String[] s) {
		Word t = new example();
		t.fillup();
		((example)t).print(2);
		((Word)t).printAll();
	}
}