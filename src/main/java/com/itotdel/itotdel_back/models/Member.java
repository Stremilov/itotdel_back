package com.itotdel.itotdel_back.models;


import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties
public class Member {
    private String name;
    private String lastName;
    private Integer age;
    private String stream;

}
