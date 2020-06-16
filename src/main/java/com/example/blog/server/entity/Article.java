package com.example.blog.server.entity;

public class Article {

//    "id": 1,
//            "title": "Baptists",
//            "content": "Baptist churches also generally subscribe to the doctrines of soul competency, sola fide (salvation by faith alone), sola scriptura (scripture alone as the rule of faith and practice) and congregationalist church government.",
//            "imgUrl":
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    private String title;
    private String content;
    private String imgUrl;
}
