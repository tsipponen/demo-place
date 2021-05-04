package com.example.demo.Place;

import com.example.demo.Models.Data.Data;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PlaceService {

    private final RestTemplate restTemplate;
    private final ObjectMapper mapper;

    public PlaceService(RestTemplateBuilder builder, ObjectMapper mapper)
    {
        this.restTemplate = builder.build();
        this.mapper = mapper;
        this.mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
    }
    public Place getPlaces() throws JsonProcessingException {

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(
                "http://open-api.myhelsinki.fi/v1/places/",
                String.class);
        ObjectReader reader = mapper.readerFor(new TypeReference<List<Data>>() {
        });
        JsonNode root = mapper.readTree(responseEntity.getBody());

        var placeObj = mapper.treeToValue(root, Place.class);
        return placeObj;

    }
}
