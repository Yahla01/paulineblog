package data.models;

import java.time.LocalDateTime;

public class Comments {

    private int commentId;
    private int articleId;
    private int userId;
    private String comment;
    private final LocalDateTime timeCreated = LocalDateTime.now();

    public int getId() {
        return commentId;
    }

    public void setId(int commentId) {
        this.commentId = commentId;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }


}
