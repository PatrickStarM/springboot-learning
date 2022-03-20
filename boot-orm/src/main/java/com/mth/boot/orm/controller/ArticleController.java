package com.mth.boot.orm.controller;

import com.mth.boot.orm.entity.Article;
import com.mth.boot.orm.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/18
 **/
@RestController
//@RequestMapping(value = "/api/v1/articles")
@AllArgsConstructor
public class ArticleController {

    private final ArticleService articleService;

//    @GetMapping(value = "/all")
//    public List<Article> selectAll() {
//        return articleService.selectAll();
//    }
}
