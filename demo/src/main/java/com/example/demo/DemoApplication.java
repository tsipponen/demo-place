package com.example.demo;

import com.example.demo.Place.Place;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@GetMapping
	public List<Place> hello(){
		return List.of(
				new Place("Test1", "Testikuja 1", true),
				new Place("Test2", "Testikatu 3 b", false)
		);
	}
}

