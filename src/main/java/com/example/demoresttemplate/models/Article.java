package com.example.demoresttemplate.models;

import com.example.demoresttemplate.CustomDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.sql.Timestamp;

@JsonDeserialize(using = CustomDeserializer.class)
public class Article {

    private Integer id;
    @JsonProperty("title_km")
    private String titleKm;
    @JsonProperty("title_en")
    private String titleEn;
    @JsonProperty("title_th")
    private String titleTh;
    @JsonProperty("title_fr")
    private String titleFr;
    @JsonProperty("title_es")
    private String titleEs;
    @JsonProperty("description_km")
    private String descriptionKm;
    @JsonProperty("description_en")
    private String descriptionEn;
    @JsonProperty("description_th")
    private String descriptionTh;
    @JsonProperty("description_fr")
    private String descriptionFr;
    @JsonProperty("description_es")
    private String descriptionEs;
    @JsonProperty("include_km")
    private String includeKm;
    @JsonProperty("include_en")
    private String includeEn;
    @JsonProperty("include_th")
    private String includeTh;
    @JsonProperty("include_fr")
    private String includeFr;
    @JsonProperty("include_es")
    private String includeEs;
    private Category category;
    private User user;
    @JsonProperty("created_date")
    private Timestamp createdDate;
    private Boolean status;


    public Article(Integer id, String titleKm, String titleEn, Category category) {
        this.id = id;
        this.titleKm = titleKm;
        this.titleEn = titleEn;
        this.category = category;
    }

    public Article() {
    }

    public Article(Integer id, String titleKm, String titleEn, String titleTh, String titleFr, String titleEs, String descriptionKm, String descriptionEn, String descriptionTh, String descriptionFr, String descriptionEs, String includeKm, String includeEn, String includeTh, String includeFr, String includeEs, Category category, User user, Timestamp createdDate, Boolean status) {
        this.id = id;
        this.titleKm = titleKm;
        this.titleEn = titleEn;
        this.titleTh = titleTh;
        this.titleFr = titleFr;
        this.titleEs = titleEs;
        this.descriptionKm = descriptionKm;
        this.descriptionEn = descriptionEn;
        this.descriptionTh = descriptionTh;
        this.descriptionFr = descriptionFr;
        this.descriptionEs = descriptionEs;
        this.includeKm = includeKm;
        this.includeEn = includeEn;
        this.includeTh = includeTh;
        this.includeFr = includeFr;
        this.includeEs = includeEs;
        this.category = category;
        this.user = user;
        this.createdDate = createdDate;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleKm() {
        return titleKm;
    }

    public void setTitleKm(String titleKm) {
        this.titleKm = titleKm;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTitleTh() {
        return titleTh;
    }

    public void setTitleTh(String titleTh) {
        this.titleTh = titleTh;
    }

    public String getTitleFr() {
        return titleFr;
    }

    public void setTitleFr(String titleFr) {
        this.titleFr = titleFr;
    }

    public String getTitleEs() {
        return titleEs;
    }

    public void setTitleEs(String titleEs) {
        this.titleEs = titleEs;
    }

    public String getDescriptionKm() {
        return descriptionKm;
    }

    public void setDescriptionKm(String descriptionKm) {
        this.descriptionKm = descriptionKm;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getDescriptionTh() {
        return descriptionTh;
    }

    public void setDescriptionTh(String descriptionTh) {
        this.descriptionTh = descriptionTh;
    }

    public String getDescriptionFr() {
        return descriptionFr;
    }

    public void setDescriptionFr(String descriptionFr) {
        this.descriptionFr = descriptionFr;
    }

    public String getDescriptionEs() {
        return descriptionEs;
    }

    public void setDescriptionEs(String descriptionEs) {
        this.descriptionEs = descriptionEs;
    }

    public String getIncludeKm() {
        return includeKm;
    }

    public void setIncludeKm(String includeKm) {
        this.includeKm = includeKm;
    }

    public String getIncludeEn() {
        return includeEn;
    }

    public void setIncludeEn(String includeEn) {
        this.includeEn = includeEn;
    }

    public String getIncludeTh() {
        return includeTh;
    }

    public void setIncludeTh(String includeTh) {
        this.includeTh = includeTh;
    }

    public String getIncludeFr() {
        return includeFr;
    }

    public void setIncludeFr(String includeFr) {
        this.includeFr = includeFr;
    }

    public String getIncludeEs() {
        return includeEs;
    }

    public void setIncludeEs(String includeEs) {
        this.includeEs = includeEs;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", titleKm='" + titleKm + '\'' +
                ", titleEn='" + titleEn + '\'' +
                ", titleTh='" + titleTh + '\'' +
                ", titleFr='" + titleFr + '\'' +
                ", titleEs='" + titleEs + '\'' +
                ", descriptionKm='" + descriptionKm + '\'' +
                ", descriptionEn='" + descriptionEn + '\'' +
                ", descriptionTh='" + descriptionTh + '\'' +
                ", descriptionFr='" + descriptionFr + '\'' +
                ", descriptionEs='" + descriptionEs + '\'' +
                ", includeKm='" + includeKm + '\'' +
                ", includeEn='" + includeEn + '\'' +
                ", includeTh='" + includeTh + '\'' +
                ", includeFr='" + includeFr + '\'' +
                ", includeEs='" + includeEs + '\'' +
                ", category=" + category +
                ", user=" + user +
                ", createdDate=" + createdDate +
                ", status=" + status +
                '}';
    }
}
