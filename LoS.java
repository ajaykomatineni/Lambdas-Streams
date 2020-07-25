import java.util.*;
public class LoS{
	public static void main(String args[]){
		List<String> myL = Arrays.asList("apple","cdmon","runner","avinash","anna");
		String start = "a";
		myL.stream()
		.map(s -> s.substring(0, 3))
		.filter(x -> x.startsWith(start))
		.forEach(System.out::println);
	}
}