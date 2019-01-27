package com.example.demoresttemplate;

import com.example.demoresttemplate.models.Author;
import com.example.demoresttemplate.models.Article;
import com.example.demoresttemplate.models.CategorySocial;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.*;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class DemoRestTemplateApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(DemoRestTemplateApplication.class, args);
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {

//        Test();

        this.save(new CategorySocial("New Cate"));
    }

    public void Test1() throws IOException{
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
//        headers.add("Authorization", "Basic c2lkYToxMjMxMjM=");
//        headers.add("ContentType", "application/json");
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBasicAuth("sida", "123123");
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<Map> response = restTemplate.exchange(
                "http://localhost:2020/api/v1/authors",
                HttpMethod.GET,
                httpEntity,
                Map.class);

        Map<String, Object> mapObject = (HashMap<String, Object>) response.getBody();

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(response.getBody().get("data"));
        // map string to collection of author
        CollectionType listType =
                mapper.getTypeFactory().constructCollectionType(ArrayList.class, Author.class);
        List<Author> authors1 = mapper.readValue(jsonString, listType);
        for (Author a :
                authors1) {
            System.out.println(a);
        }
    }

    public void Test() throws IOException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic QVBJX0hBTkNIRVlFQ09SRVNPUlRfVVNFUk5BTUU6QVBJX0hBTkNIRVlFQ09SRVNPUlRfUEFTU1dPUkQ=");
//        headers.add("ContentType", "application/json");
        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setBasicAuth("sida", "123123");
        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        ResponseEntity<Map> response = restTemplate.exchange(
                "http://178.128.28.164:15000/api/v1/article/{id}",
                HttpMethod.GET,
                httpEntity,
                Map.class, 95);


        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(response.getBody().get("data"));

        System.out.println(jsonString);
        // map string to collection of author
//        CollectionType listType =
//                mapper.getTypeFactory().constructCollectionType(ArrayList.class, Author.class);
        System.out.println(mapper.readValue(jsonString, Article.class));



    }

    public Boolean save(CategorySocial categorySocial) throws IOException {

        RestTemplate restTemplate = new RestTemplate();

//        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor("user_api","api_user_1234"));
        Boolean responseEntity =  restTemplate.postForObject("http://178.128.28.164:8081/api/v1/categories", categorySocial, Boolean.class);

        return responseEntity;

    }




}

