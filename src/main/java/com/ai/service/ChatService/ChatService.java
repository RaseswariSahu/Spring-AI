package com.ai.service.ChatService;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    @Autowired
    private ChatModel chatModel;

    public String generateResponse(String inputText){
        //use aI
        return chatModel.call(inputText);
    }
}
