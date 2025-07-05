package com.deloitte.stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.deloitte.person.dto.PersonDTO;

public class Streams {
	
	public void evenNumbers(List<Integer> numbers) {

		List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		evenNumbers.forEach((System.out::println));
	}
	
	public void oddNumbers(List<Integer> numbers) {
		List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		oddNumbers.forEach((System.out::println));
	}
	
	public void lengthOfEachString(List<String> names) {
		List<Integer> nameLengths = names.stream().map(x -> x.length()).collect(Collectors.toList());
		nameLengths.forEach(x-> System.out.println(x));
	}
	
	public void flatMapping(List<List<Integer>> nestedLists) {
		List<Integer> flattenedList = nestedLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList()); 
		flattenedList.forEach(x-> System.out.println(x));
	}
	
	public void groupingByLogic(List<PersonDTO> personLists) {
		Map<Integer,List<PersonDTO>> persList = personLists.stream()
                .collect(Collectors.groupingBy(PersonDTO::getAge)); 
		persList.forEach((age, people) -> {
		    System.out.println("Age: " + age);
		    people.forEach(person -> System.out.println(person.getName()+ "  " + person.getAge()));
		});
	}
	
	public void matchingLogics(List<Integer> numbers) {
		boolean anyEven = numbers.stream().anyMatch(n -> n % 2 == 0);    // true
		boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);    // false
		boolean noneOdd = numbers.stream().noneMatch(n -> n % 2 != 0); 
		
		System.out.println(anyEven + " " + allEven + " " + noneOdd);
	}

	public void findingLogic(List<Integer> numbers) {
		Optional<Integer> firstEven = numbers.stream().filter(n -> n % 2 == 0).findFirst();
		System.out.println(firstEven);
		Optional<Integer> anyEven = numbers.stream().filter(n -> n % 2 == 0).findAny();
		System.out.println(anyEven);
	}
	
	public void limitedAndSkip(List<Integer> numbers) {
		List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited List");
		limited.forEach(x-> System.out.println(x + " "));
		List<Integer> skipped = numbers.stream().skip(2).collect(Collectors.toList());
		System.out.println("Skipped List");
		skipped.forEach(x-> System.out.println(x + " "));
	}
	
	public void sortedList(List<String> names ) {
		List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList()); 
		sortedNames.forEach(x-> System.out.println(x + " "));
	}
	
	public void distinctList(List<Integer> numbers) {
		List<Integer> numbersList = numbers.stream()
                .distinct()
                .collect(Collectors.toList()); 
		numbersList.forEach(x-> System.out.println(x + " "));
	}
		
	public void MaxandMin(List<Integer> numbers) {
		Optional<Integer> maximum = numbers.stream()
                .max((a, b) -> a.compareTo(b));
              
		System.out.println("Maximum" + " " + maximum.get());
		
		Optional<Integer> minimum = numbers.stream()
                .min((a, b) -> a.compareTo(b));
              
		System.out.println("Minimum" + "" + minimum.get());
	}
}
