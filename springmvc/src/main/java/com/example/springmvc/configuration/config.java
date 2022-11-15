package com.example.springmvc.configuration;

import org.springframework.beans.factory.annotation.Value;

public class config {
    @Value("${strong.name1}")
    private String strong;
}
