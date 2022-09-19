package com.ll.exam.app20220916.article.base;

import com.ll.exam.app20220916.article.service.ArticleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestInitData {
    @Bean
    public CommandLineRunner testDevData(ArticleService articleService){
        return args -> {
            articleService.write("제목1");
            articleService.write("제목2");
        };
    }
}
