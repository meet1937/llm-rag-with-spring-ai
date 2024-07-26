If you want to run these codes you need to set up your OpenAI API key to environment variables first.

```bash
export OPEN_AI_API_KEY=your_openai_api_key
```

Then you can run the demos with Maven.

```bash
mvn spring-boot:run
```

REST API will be available at `http://localhost:8080`. Two demos are in:

<http://localhost:8080/robobrain/musashi>

<http://localhost:8080/robobrain/rag>

For PDF reading example source is TIOBE.pdf that's simply a snapshot of TIOBE index page at <http://www.tiobe.com/tiobe-index/>


# Using Another Language Model (LLM) in Your Spring Boot Application

To use another language model (LLM) in your Spring Boot application, you can add the dependency to your `pom.xml` and set the required properties in your `application.properties` file. Here's how to do it:

## 1. Add Dependency to `pom.xml`

First, add the dependency for the desired LLM library to your `pom.xml`. Here's an example using the hypothetical `example-llm-client` library:

```xml
<dependency>
    <groupId>com.example</groupId>
    <artifactId>example-llm-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 2. Configure Properties in `application.properties`

Next, configure the necessary properties in your `application.properties` file. These properties typically include API keys, endpoint URLs, and any other required configurations. Here's an example:

```properties
llm.api.url=https://api.example-llm.com
llm.api.key=your-api-key-here
llm.api.timeout=30s
```
By following these steps, you can integrate a different LLM into your Spring Boot application easily.
