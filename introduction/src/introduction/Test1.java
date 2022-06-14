package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=Arrays.asList(3,2,2,7,5,1,9,7);
		
		//print unique numbers from this array
		
		numbers.stream().distinct().forEach(s->System.out.println(s));
		
		//sort the array
		
		List<Integer> li=numbers.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

}
