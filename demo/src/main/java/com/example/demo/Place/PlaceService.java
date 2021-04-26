package com.example.demo.Place;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceService {
    public List<Place> getPlaces(){
        return List.of(
                new Place("Test1", "Testikuja 1", true),
                new Place("Test2", "Testikatu 3 b", false)
        );
    }
}
