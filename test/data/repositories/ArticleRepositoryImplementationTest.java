package data.repositories;

import data.models.Article;
import data.models.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArticleRepositoryImplementationTest {

    private ArticleRepository articleRepository;
    private Article article;

    @Test
    void saveOneArticle_countIsOneTest() {
        Article article = new Article();
        articleRepository.save(article);
        assertEquals(1, articleRepository.count());
    }
""
    @Test
    void saveOneArticle_IdOfArticleIsOneTest() {
        Article savedArticle = articleRepository.save(article);
        articleRepository.save(article);
        assertEquals(1, savedArticle.getId());
    }

    @DisplayName("Update Article Test")
    @Test
    void saveTwoArticlesWithSameId_countIsOneTest() {
        Article savedArticle = articleRepository.save(article);
        assertEquals(1, articleRepository.count());
        savedArticle.setLastName("PriestHood");
        articleRepository.save(savedArticle);

    }

}


