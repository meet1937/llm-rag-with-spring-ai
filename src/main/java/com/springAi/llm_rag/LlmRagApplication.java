package com.springAi.llm_rag;

import org.springframework.ai.embedding.EmbeddingClient;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class LlmRagApplication {

	public static void main(String[] args) {
		SpringApplication.run(LlmRagApplication.class, args);
	}

	@Configuration
	class AppConfig {
		@Bean
		VectorStore vectorStore(EmbeddingClient embeddingClient) {
			return new SimpleVectorStore(embeddingClient);
		}
	}

}
