package com.vitoju.kvizoramakvizoteka.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Question {

    private Integer id;
    private String name;
}
