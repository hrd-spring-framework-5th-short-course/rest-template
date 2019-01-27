package com.example.demoresttemplate;

import com.example.demoresttemplate.models.Article;
import com.example.demoresttemplate.models.Category;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class CustomDeserializer extends StdDeserializer<Article> {

    public CustomDeserializer() {
        this(null);
    }

    public CustomDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Article deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {

        JsonNode node = jp.getCodec().readTree(jp);
        int id = (Integer) (node.get("id")).numberValue();
        String titleKm = node.get("title_km").asText();
        String titleEn = node.get("title_en").asText();

        int cateId = node.get("category").get("id").asInt();
        String cateName = node.get("category").get("name").asText();

        return new Article(id, titleKm, titleEn, new Category(cateId, cateName));
    }

}
