package com.example.demoresttemplate.forms.article;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleForm {

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
    @JsonProperty("category_id")
    private Integer categoryId;
    @JsonProperty("user_id")
    private Integer userId;

    public ArticleForm() {
    }

    public ArticleForm(Integer id, String titleKm, String titleEn, String titleTh, String titleFr, String titleEs, String descriptionKm, String descriptionEn, String descriptionTh, String descriptionFr, String descriptionEs, String includeKm, String includeEn, String includeTh, String includeFr, String includeEs, Integer categoryId, Integer userId) {
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
        this.categoryId = categoryId;
        this.userId = userId;
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

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
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
                ", categoryId=" + categoryId +
                ", userId=" + userId +
                '}';
    }
}
