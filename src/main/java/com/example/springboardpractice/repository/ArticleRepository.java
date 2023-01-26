package com.example.springboardpractice.repository;

import com.example.springboardpractice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}