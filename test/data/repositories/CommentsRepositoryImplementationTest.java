package data.repositories;

import data.models.Article;
import data.models.Comments;
import data.models.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommentsRepositoryImplementationTest {

    @Test
    public void saveOneComment_commentIsOne() {
        Comments comment = new Comments();
        CommentsRepository commentRepository = new CommentsRepositoryImplementation();
        commentRepository.save(comment);
        assertEquals( 1, commentRepository.count());
    }

    @Test
    public void saveOneComment_IdOfCommentIsOne() {
        Comments comment = new Comments();
        CommentsRepository commentRepository = new CommentsRepositoryImplementation();
        Comments savedComment = commentRepository.save(comment);
        assertEquals(1, savedComment.getId());
    }

    @Test
    public void saveTwoCommentsWithSameId_countIsOneTest() {
        Comments comment = new Comments();
        CommentsRepository commentRepository = new CommentsRepositoryImplementation();
        Comments savedComment = commentRepository.save(comment);
        savedComment.setComment("Happy Val");
        commentRepository.save(savedComment);
        assertEquals(1, commentRepository.count());



    }


}