package com.example.nutrival.businessLogic.ServiceImpl;

import exception.BadFormatException;
import exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

public interface NutriService {
  String getValuesJson(@PathVariable String value)
      throws IOException, InterruptedException, BadFormatException, ResourceNotFoundException;
}
