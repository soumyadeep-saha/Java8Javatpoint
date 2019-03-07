package com.soumyadeep.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {

		// The key point to note here is that the function used by map() operation
		// returns a single value.
		// In short, the flatMap() function is used to convert a Stream of Stream into a
		// list of values.
		// you can use the flatMap() to flatten a Stream of Stream of values into just a
		// Stream of values.
		// This operation is really useful to get the full list by combining several
		// small lists.

		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");

		List<List<String>> playersInWorldCup2016 = new ArrayList<>();
		playersInWorldCup2016.add(teamIndia);
		playersInWorldCup2016.add(teamAustralia);
		playersInWorldCup2016.add(teamEngland);
		playersInWorldCup2016.add(teamNewZeland);
		playersInWorldCup2016.add(teamSouthAfrica);
		playersInWorldCup2016.add(teamWestIndies);
		playersInWorldCup2016.add(teamSriLanka);
		playersInWorldCup2016.add(teamPakistan);

		// Let's print all players before Java 8
		List<String> allPlayersListBeforeJava8 = new ArrayList<>();
		for (List<String> list : playersInWorldCup2016) {
			for (String s : list) {
				allPlayersListBeforeJava8.add(s);
			}
		}
		System.out.println("Players playing in world cup 2016");
		System.out.println(allPlayersListBeforeJava8);

		// Now let's do this in Java 8 using FlatMap
		List<String> flatMapList = playersInWorldCup2016.stream().flatMap(p -> p.stream()).collect(Collectors.toList());
		System.out.println("List of all Players using Java 8");
		System.out.println(flatMapList);
	}
}
