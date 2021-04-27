package com.example.demo.Place;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.context.Theme;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@Service
public class PlaceService {

    private final RestTemplate restTemplate;
    private final ObjectMapper mapper;

    public PlaceService(RestTemplateBuilder builder, ObjectMapper mapper)
    {
        this.restTemplate = builder.build();
        this.mapper = mapper;
    }
    public List<Place> getPlaces() throws JsonProcessingException {
        TypeFactory typeFactory = mapper.getTypeFactory();

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "http://open-api.myhelsinki.fi/v1/places/?limit=1",
                String.class);
        MapType mapType = typeFactory.constructMapType(HashMap.class, String.class, Theme.class);
        var test = responseEntity.getBody();
        Place place = mapper.readValue(test, Place.class);
        String dataStr = place.getData();
        return List.of(
                new Place()
        );

    }
}
