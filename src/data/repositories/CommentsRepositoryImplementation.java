package data.repositories;

import data.models.Comments;

import java.util.List;

public class CommentsRepositoryImplementation implements CommentsRepository{
    private int count;

    @Override
    public Comments save(Comments comment) {
        comment.setId(count+1);
        count++;
        return comment;
    }

    @Override
    public Comments findByCommentId(int CommentsId) {
        return null;
    }

    @Override
    public long count() {
        return count;
    }

    @Override
    public List<Comments> findAll() {
        return null;
    }

    @Override
    public void delete(Comments comments) {

    }

    @Override
    public void delete(int Commentsid) {

    }

    @Override
    public void deleteAll() {

    }
}
