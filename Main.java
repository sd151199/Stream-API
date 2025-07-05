package com.deloitte.stream;

import java.util.Arrays;
import java.util.List;

import com.deloitte.person.dto.PersonDTO;

public class Main {

	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
		List<Integer> numbers2 = Arrays.asList(1, 2, 2, 2, 3, 3, 3, 4, 5, 6);
		
		List<List<Integer>> nestedLists = Arrays.asList(
			    Arrays.asList(1, 2),
			    Arrays.asList(3, 4, 5),
			    Arrays.asList(6)
			);
		
		List<PersonDTO> people = Arrays.asList(
	            new PersonDTO("Alice", 25),
	            new PersonDTO("Bob", 30),
	            new PersonDTO("Charlie", 25),
	            new PersonDTO("David", 30)
	        );
		
		Streams obj = new Streams();
		
		System.out.println("Even Numbers");
		obj.evenNumbers(numbers);
		
		System.out.println("Odd Numbers");
		obj.oddNumbers(numbers);
		
		System.out.println("Lengths of Names");
		obj.lengthOfEachString(names);
		
		System.out.println("Flat Mapping");
		obj.flatMapping(nestedLists);
		
		System.out.println("Grouping By Mapping");
		obj.groupingByLogic(people);
		
		System.out.println("Matching Criteria");
		obj.matchingLogics(numbers);
		
		System.out.println("Finding Criteria");
		obj.findingLogic(numbers);
		
		System.out.println("Limited and Skipped");
		obj.limitedAndSkip(numbers);
		
		System.out.println("Sorted List");
		obj.sortedList(names);
		
		System.out.println("Distinct List");
		obj.distinctList(numbers2);
		
		System.out.println("maximum and minimum");
		obj.MaxandMin(numbers);
	}
}
