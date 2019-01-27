package com.example.demoresttemplate.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.util.List;

public class Category {
    private int id;
    private boolean isMenu;
    private String name;
    private String description;

    @JsonProperty("other_comment_title")
    private String otherCommentTitle;

    @JsonProperty("other_comment")
    private String otherComment;

    private User user;

    @JsonProperty("category_parent_id")
    private Integer categoryParentId;
    @JsonProperty("icon_url")
    private String iconUrl;

    @JsonProperty("sub_categories")
    private List<Category> subCategories;

    @JsonProperty("created_date")
    private Timestamp createdDate;
    private boolean status;

    private String url;
    private String slug;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isMenu() {
        return isMenu;
    }

    public void setMenu(boolean menu) {
        isMenu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOtherCommentTitle() {
        return otherCommentTitle;
    }

    public void setOtherCommentTitle(String otherCommentTitle) {
        this.otherCommentTitle = otherCommentTitle;
    }

    public String getOtherComment() {
        return otherComment;
    }

    public void setOtherComment(String otherComment) {
        this.otherComment = otherComment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getCategoryParentId() {
        return categoryParentId;
    }

    public void setCategoryParentId(Integer categoryParentId) {
        this.categoryParentId = categoryParentId;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", isMenu=" + isMenu +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", otherCommentTitle='" + otherCommentTitle + '\'' +
                ", otherComment='" + otherComment + '\'' +
                ", user=" + user +
                ", categoryParentId=" + categoryParentId +
                ", iconUrl='" + iconUrl + '\'' +
                ", subCategories=" + subCategories +
                ", createdDate=" + createdDate +
                ", status=" + status +
                ", url='" + url + '\'' +
                ", slug='" + slug + '\'' +
                '}';
    }
}
