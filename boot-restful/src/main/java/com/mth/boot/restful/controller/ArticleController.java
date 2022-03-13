package com.mth.boot.restful.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.mth.boot.restful.common.AjaxResponse;
import com.mth.boot.restful.model.Article;
import com.mth.boot.restful.model.Reader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class ArticleController {
//    @GetMapping("/articles/{id}")
//    public AjaxResponse getArticle(@PathVariable("id") Long id){
//        Article article = Article.builder()
//                .id(id)
//                .author("aaa")
//                .title("aaa")
//                .content("aaa")
//                .createTime(new Date())
//                .updateTime(new Date())
//                .build();
//        return AjaxResponse.success(article);
//
//    }
//    @PostMapping("/articles")
//    public AjaxResponse saveArticle(@RequestBody Article article) {
//        log.info("修改文章: " +article);
//        return AjaxResponse.success(article);
//    }
//    @PutMapping("/articles")
//    public AjaxResponse updateArticle(@RequestBody Article article) {
//        log.info( "更新文章: " + article);
//        return AjaxResponse.success(article);
//    }
//    @DeleteMapping("/articles")
//    public AjaxResponse deleteArticle(@RequestParam Long id) {
//        log.info( "删除文章: " + id);
//        return AjaxResponse.success();
//    }
//
//
//    @GetMapping("/articles/{id}")
//    public AjaxResponse getArticle(@PathVariable("id") Long id) {
//        Article article = Article.builder().id(id).author("mth").content("SpringBoot 从青铜到王者").title("SpringBoot").createTime(new Date()).build();
//        log.info("article:" + article);
//        return AjaxResponse.success(article);
//    }


    @GetMapping("/articles/{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
//        Reader[] readers = {
//                Reader.builder().name(" aaa").age(12).build(),Reader.builder().name("bbb").age(13).build()
//
//        };
        List<Reader> readerList = List.of(Reader.builder().name(" aaa").age(12).build(),Reader.builder().name("bbb").age(13).build());
        Article article = Article.builder()
                .id(id).author("mth")
                .content("SpringBoot 从青铜到王者")
                .title("SpringBoot")
                .createTime(new Date())
                .readerList(readerList)
                .build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    /**
     * 增加一篇Article ，使用POST方法(RequestBody方式接收参数)
     *
     * @param article article
     * @param aaa     aaa
     * @return AjaxResponse
     */
//    @PostMapping("/articles")
//    public AjaxResponse saveArticle(@RequestBody Article article, @RequestHeader String aaa) {
//        log.info("saveArticle:" + article);
//        log.info("请求头aaa:" + aaa);
//        return AjaxResponse.success(article);
//    }

    /**
     * 增加一篇Article ，使用POST方法(RequestParam方式接收参数
     *
     * @param author     author
     * @param title      title
     * @param content    content
     * @param createTime createTime
     * @return AjaxResponse
     */
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@RequestParam String author, @RequestParam String title, @RequestParam String content, @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date createTime) {
        log.info("saveArticle:" + author);
        log.info("saveArticle:" + title);
        log.info("saveArticle:" + content);
        log.info("saveArticle:" + createTime);
        return AjaxResponse.success();
    }

    /**
     * 更新一篇Article，使用PUT方法，以id为主键进行更新
     *
     * @param article article
     * @return AjaxResponse
     */
    @PutMapping("/articles")
    public AjaxResponse updateArticle(@RequestBody Article article) {
        if (article.getId() == null) {
            log.error("没有id");
            //article.id是必传参数，因为通常根据id去修改数据
        }
        log.info("updateArticle:" + article);
        return AjaxResponse.success();
    }

    /**
     * 删除一篇Article，使用DELETE方法，参数是id
     *
     * @param id id
     * @return AjaxResponse
     */
    @DeleteMapping("/articles/{id}")
    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
        log.info("deleteArticle:" + id);
        return AjaxResponse.success();
    }
}