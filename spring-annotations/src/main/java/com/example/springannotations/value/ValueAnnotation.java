package com.example.springannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotation {
    @Value("Default Name")
    private String defaultName;

    @Value("${mail.host}")
    private String host;

    @Value("${mail.email}")
    private String email;

    @Value("${mail.password}")
    private String password;

    @Value("${HOME}")
    private String homeDir;

    public String getHomeDir() {
        return homeDir;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public String getEmail() {
        return email;
    }

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }
}
