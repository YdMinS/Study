package com.ydmins.board.service;

import com.ydmins.board.domain.Article;
import com.ydmins.board.domain.ArticleComment;
import com.ydmins.board.dto.ArticleCommentDto;
import com.ydmins.board.dto.ArticleDto;
import com.ydmins.board.dto.ArticleUpdateDto;
import com.ydmins.board.repository.ArticleCommentRepository;
import com.ydmins.board.repository.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.*;

@DisplayName("비즈니스 로직 - 댓글")
@ExtendWith(MockitoExtension.class)
class ArticleCommentServiceTest {

    @InjectMocks private ArticleCommentService sut;

    @Mock private ArticleCommentRepository articleCommentRepository;
    @Mock private ArticleRepository articleRepository;

    @DisplayName("게시글 ID로 조회하면, 해당하는 댓글 리스트를 반환한다.")
    @Test
    void givenArticleId_whenSearchingComments_thenReturnArticleComments(){
        // given
        Long articleId = 1L;
        given(articleRepository.findById(articleId))
                .willReturn(Optional.of(Article.of("title", "content", "#java")));

        // when
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(articleId);

        // then
        assertThat(articleComments).isNotNull();
        then(articleRepository).should().findById(articleId);
    }

    @DisplayName("게시글 ID로 조회하면, 해당하는 댓글 리스트를 반환한다.")
    @Test
    void givenArticleId_whenSearchingComments_thenReturnArticleComments(){
        // given
        Long articleId = 1L;
        given(articleRepository.findById(articleId))
                .willReturn(Optional.of(Article.of("title", "content", "#java")));

        // when
        List<ArticleCommentDto> articleComments = sut.searchArticleComment(articleId);

        // then
        assertThat(articleComments).isNotNull();
        then(articleRepository).should().findById(articleId);
    }

    @DisplayName("댓글 정보를 입력하면, 댓글을 생성한다.")
    @Test
    void givenArticleCommentInfo_whenSavingArticleComment_thenSaveArticleComment(){
        // given
        given(articleCommentRepository.save(any(ArticleComment.class))).willReturn(null);

        // when
        sut.saveArticleComment(ArticleCommentDto.of(LocalDateTime.now(), "YdMinS", "content" ));

        // then
        then(articleCommentRepository).should().save(any(ArticleComment.class));
    }

    @DisplayName("댓글 ID와 수정 정보를 입력하면, 댓글을 수정한다.")
    @Test
    void givenArticleCommentIdAndModifiedIinfo_whenUpdatingArticleComment_thenUpdateArticleComment(){
        // given
        given(articleCommentRepository.save(any(ArticleComment.class))).willReturn(null);

        // when
        sut.updateArticleComment(1L, "content");

        // then
        then(articleCommentRepository).should().save(any(ArticleComment.class));
    }

    @DisplayName("댓글 ID를 입력하면, 댓글을 삭제한다.")
    @Test
    void givenArticleCommentId_whenDeletingArticleComment_thenDeleteArticleComment(){
        // given
        willDoNothing().given(articleCommentRepository).delete(any(ArticleComment.class));

        // when
        sut.deleteArticleComment(1L);

        // then
        then(articleCommentRepository).should().delete(any(ArticleComment.class));
    }
}