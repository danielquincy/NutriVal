package com.example.nutrival.controller;

import com.example.nutrival.businessLogic.ServiceImpl.NutriService;
import exception.BadFormatException;
import exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/apiValues/")
public class ApiController {
  private final NutriService oNutriService;

  @Autowired
  public ApiController(final NutriService oNutriService) {
    this.oNutriService = oNutriService;
  }

  @GetMapping(path = "get/{value}")
  public String getValuesJson(@PathVariable String value) throws Exception {
    return oNutriService.getValuesJson(value);
  }
}
