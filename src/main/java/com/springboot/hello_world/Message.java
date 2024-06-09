package com.springboot.hello_world;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Message {  // (1)
    @Id    // (2)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long messageId;
    private String message;
}