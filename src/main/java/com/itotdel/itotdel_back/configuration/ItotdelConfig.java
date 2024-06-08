package com.itotdel.itotdel_back.configuration;


import com.itotdel.itotdel_back.models.Member;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;

@ConfigurationProperties(prefix = "itotdel")
public class ItotdelConfig {
    private ArrayList<Member> Members;
}
