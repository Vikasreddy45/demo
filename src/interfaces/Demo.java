package interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
interface Addition{
	public int add(int x,int y);
	//public void m1();
}
public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ob = (int x,int y) -> {
			return x+y;
		};
		List<String> cities = Arrays.asList("Mumbai","Huderabad","Manglore","Chennai");
		
		cities.stream().filter(c -> c.charAt(0) == 'M' ).forEach(city -> System.out.println(city));
		
	}

}
