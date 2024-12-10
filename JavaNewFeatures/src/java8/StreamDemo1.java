package java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<String>>namesNested=Arrays.asList(
				
				Arrays.asList("shiva","yannam"),
				Arrays.asList("sirisha","yannam"),
				Arrays.asList("rani","guvvala"),
				Arrays.asList("manisha","yannam")
				
				);
		
		List<String> collect = namesNested.stream().flatMap(Collection::stream)
		.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
	}

}
