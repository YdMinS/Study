package com.ydmins.board.repository;

import com.ydmins.board.config.JpaConfig;
import com.ydmins.board.domain.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("JPA 연결 테스트")
@Import(JpaConfig.class)
@DataJpaTest
class JpaRepositoryTest {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    public JpaRepositoryTest(
            @Autowired ArticleRepository articleRepository,
            @Autowired ArticleCommentRepository articleCommentRepository
    ){
        this.articleRepository = articleRepository;
        this.articleCommentRepository = articleCommentRepository;
    }


    @DisplayName("select test")
    @Test
    void givenTestData_whenSelecting_thenWorksFine(){
        // given

        // when
        List<Article> articles = articleRepository.findAll();

        // then
        assertThat(articles)
                .isNotNull()
                .hasSize(0);

    }

    @DisplayName("insert test")
    @Test
    void givenTestData_whenInserting_thenWorksFine(){
        // given
        long previousCnt = articleRepository.count();
        Article article = Article.of("new article", "new content", "#spring");

        // when
        Article savedArticle = articleRepository.save(article);

        // then
        assertThat(articleRepository.count())
                .isEqualTo(previousCnt+1);
    }

    @DisplayName("update test")
    @Test
    void givenTestData_whenUpdating_thenWorksFine(){
        // given
        Article article = articleRepository.findById(1L).orElseThrow();
        String hashtagToUpdate = "#springboot";
        article.setHashtag(hashtagToUpdate);

        // when
        Article savedArticle = articleRepository.save(article);

        // then
        assertThat(savedArticle).hasFieldOrPropertyWithValue("hashtag", hashtagToUpdate);
    }

    @DisplayName("delete test")
    @Test
    void givenTestData_whenDeleting_thenWorksFine(){
        // given
        Article article = articleRepository.findById(1L).orElseThrow();
        long previousArticleCnt = articleRepository.count();

        // when
        articleRepository.delete(article);

        // then
        assertThat(articleRepository.count()).isEqualTo(previousArticleCnt-1);
    }
}