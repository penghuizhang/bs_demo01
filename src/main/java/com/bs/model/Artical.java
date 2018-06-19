package com.bs.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Artical {
    private Integer id;

    private String title;

    private String author;

    private String readnum;

    private String pinglunnum;

    private String sharenum;

    private Date addtime;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getReadnum() {
        return readnum;
    }

    public void setReadnum(String readnum) {
        this.readnum = readnum == null ? null : readnum.trim();
    }

    public String getPinglunnum() {
        return pinglunnum;
    }

    public void setPinglunnum(String pinglunnum) {
        this.pinglunnum = pinglunnum == null ? null : pinglunnum.trim();
    }

    public String getSharenum() {
        return sharenum;
    }

    public void setSharenum(String sharenum) {
        this.sharenum = sharenum == null ? null : sharenum.trim();
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}