package com.springboot.hello_world;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    // (1)
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
}