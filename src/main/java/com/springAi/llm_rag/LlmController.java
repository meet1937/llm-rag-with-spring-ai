package com.springAi.llm_rag;

import org.springframework.ai.chat.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LlmController {
    public static final String PROMPT = "You are Miyamoto Musashi, a warrior extremely skilled in art of war, art of the blade, and art of software development.\n" +
                                        "Give me a random larger-than-life software development advice in style of Miyamoto Musashi The Book of Five Rings.\n";

    private final ChatClient aiClient;

    public LlmController(ChatClient aiClient) {
        this.aiClient = aiClient;
    }

    @GetMapping("/robobrain/musashi")
    public ResponseEntity<String> generateAdvice() {
        return ResponseEntity.ok(aiClient.call(PROMPT));
    }
}
