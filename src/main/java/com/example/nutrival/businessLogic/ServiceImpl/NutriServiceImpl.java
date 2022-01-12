package com.example.nutrival.businessLogic.ServiceImpl;

import exception.BadFormatException;
import exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class NutriServiceImpl implements NutriService {

  private HttpResponse oHttpResponse;

  @Autowired
  public NutriServiceImpl() {}

  private String tranformQuery(String value) {
    return value.replace(" ", "%");
  }

  public String getValuesJson(final String value)
      throws IOException, InterruptedException, BadFormatException, ResourceNotFoundException {
    String oValue = tranformQuery(value);
    HttpRequest request =
        HttpRequest.newBuilder()
            .uri(
                URI.create(
                    "https://nutrition-by-api-ninjas.p.rapidapi.com/v1/nutrition?query=" + oValue))
            .header("x-rapidapi-host", "nutrition-by-api-ninjas.p.rapidapi.com")
            .header("x-rapidapi-key", "620d741191msh143bd9501894a77p177d5ejsn193dace3e6bc")
            .method("GET", HttpRequest.BodyPublishers.noBody())
            .build();
    HttpResponse<String> response =
        HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

    return response.body();
  }
}
