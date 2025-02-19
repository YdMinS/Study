package com.ydmins.board.service;

import com.ydmins.board.dto.ArticleCommentDto;
import com.ydmins.board.repository.ArticleCommentRepository;
import com.ydmins.board.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class ArticleCommentService {

    private final ArticleRepository articleRepository;
    private final ArticleCommentRepository articleCommentRepository;

    @Transactional(readOnly = true)
    public List<ArticleCommentDto> searchArticleComment(Long articleId) {
        return List.of();
    }

    public void saveArticleComment(ArticleCommentDto dot) {
    }

    public void updateArticleComment(long articleCommentId, String content) {
    }

    public void deleteArticleComment(long articleCommentId) {
    }
}
