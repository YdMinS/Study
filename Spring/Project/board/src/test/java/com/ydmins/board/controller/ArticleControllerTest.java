package com.ydmins.board.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@DisplayName("View Controller - Articles")
@WebMvcTest(controllers = ArticleControllerTest.class)
class ArticleControllerTest {

    private final MockMvc mvc;

    public ArticleControllerTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @Disabled("in development")
    @DisplayName("[view][GET] Article List - success")
    @Test
    public void givenNothing_whenRequestingArticlesView_thenReturningArticlesView() throws Exception{
        // given

        // when
        mvc.perform(get("/v1/articles"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(view().name("articles/index"))
                .andExpect(model().attributeExists("articles"));
        // then
    }

    @Disabled("in development")
    @DisplayName("[view][GET] Article Retrieve - success")
    @Test
    public void givenNothing_whenRequestingArticleView_thenReturningArticleView() throws Exception{
        // given

        // when
        mvc.perform(get("/v1/articles/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(model().attributeExists("article"))
                .andExpect(model().attributeExists("articleComments"))
                .andExpect(view().name("articles/article-view"));
        // then
    }

    @Disabled("in development")
    @DisplayName("[view][GET] Article Search Page - success")
    @Test
    public void givenNothing_whenRequestingArticlesSearchView_thenReturningArticlesSearchView() throws Exception{
        // given

        // when
        mvc.perform(get("/v1/articles/search"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(view().name("articles/search"));
        // then
    }

    @Disabled("in development")
    @DisplayName("[view][GET] Article Search with Hashtags - success")
    @Test
    public void givenNothing_whenRequestingArticlesHashtagSearchView_thenReturningHashtagArticlesSearchView() throws Exception{
        // given

        // when
        mvc.perform(get("/v1/articles/search"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.TEXT_HTML))
                .andExpect(view().name("articles/search"));
        // then
    }
}