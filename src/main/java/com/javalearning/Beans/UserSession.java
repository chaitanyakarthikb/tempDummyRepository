package com.javalearning.Beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
@Scope("prototype")
public class UserSession {
    private final String sessionId;

    public UserSession(){
        this.sessionId= UUID.randomUUID().toString();
    }

    public String getSessionId() {
        return this.sessionId;
    }
}
