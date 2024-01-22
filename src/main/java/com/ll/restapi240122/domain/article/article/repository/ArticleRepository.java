package com.ll.restapi240122.domain.article.article.repository;

import com.ll.restapi240122.domain.article.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}