package com.softserve.hw06;

import java.util.ArrayList;
import java.util.List;

enum Localization {
	EN("London", "Paris", "Madrid", "Kyiv", "Warshawa"),
	UA("Лондон", "Париж", "Мадрид", "Київ");

	private List<String> cities;

	private Localization(String... cities) {
		this.cities = new ArrayList<>();
		for (String city : cities) {
			this.cities.add(city);
		}
	}

	public void printAll() {
		for (String city : cities) {
			System.out.print(city + "  ");
		}
	}
}

public class AppLocal {
	public static void main(String[] args) {
		Localization.EN.printAll();
		System.out.println();
		Localization.UA.printAll();
	}
}
