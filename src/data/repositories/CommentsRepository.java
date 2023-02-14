package data.repositories;

import data.models.Comments;
import data.models.User;

import java.time.LocalDateTime;
import java.util.List;

public interface CommentsRepository {


    Comments save(Comments comments);

    Comments findByCommentId(int CommentsId);

    long count ();

    List<Comments> findAll();

    void delete(Comments comments);

    void delete(int CommentsId);

    void deleteAll();


}
