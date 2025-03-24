package com.example.demoCICD.api;

import com.example.demoCICD.bo.Article;
import com.example.demoCICD.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleRestController {

    @Autowired
    ArticleService articleService;

    @GetMapping("/articles")
    public List<Article> getAll() {
        //Récupérer la liste des articles
        List<Article> articles = articleService.getAll();

        return articles;
    }
}
