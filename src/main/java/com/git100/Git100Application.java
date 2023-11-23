package com.git100;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Git100Application {

	public static void main(String[] args) {
		SpringApplication.run(Git100Application.class, args);

		// Remove this line from the main method
		// removeDuplicatesFromArray();
	}

	@Test
	public void removeDuplicatesFromArrayTest() {
		String[] array = {"Shweta", "Gadkar"};

		// Using Stream API to remove duplicates
		String[] uniqueArray = Arrays.stream(array)
				.distinct()
				.toArray(String[]::new);

		// Print the result
		System.out.println(Arrays.toString(uniqueArray));
		System.out.println("hello");
	}
}
