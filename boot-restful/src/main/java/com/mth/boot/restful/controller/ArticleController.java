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
@RequestMapping("/api/v1/articles")
public class ArticleController {

//    @GetMapping("/articles/{id}")
//    public AjaxResponse getArticle(@PathVariable("id") Long id){
//        Article article=Article.builder()
//                .id(id)
//                .author("syk")
//                .title("sdada")
//                .content("sadadaw")
//                .createTime(new Date())
//
//                .build();
//
//
//        return AjaxResponse.success(article);
//    }
//     @PostMapping("/articles")
//    public AjaxResponse saveArticle(@RequestBody Article article){
//        log.info("saveArticle:"+article);
//                return AjaxResponse.success(article);
//    }
//    @PutMapping("/articles")
//    public AjaxResponse updateArticle(@RequestBody Article article){
//        log.info("updateArticle:"+article);
//        return AjaxResponse.success(article);
//    }
//    @DeleteMapping("/articles")
//    public AjaxResponse deleteArticle(@RequestParam Article article){
//        log.info("deleteArticle:"+article);
//        return AjaxResponse.success(article);
//    }
    /**
     * 获取一篇Article，使用GET方法,根据id查询一篇文章
     *
     * @param id id
     * @return AjaxResponse
     */
    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.GET)
//    @GetMapping("/articles/{id}")
//    public AjaxResponse getArticle(@PathVariable("id") Long id) {
//
//                List<Reader> readerList = List.of(Reader.builder().name("aaa").age(12).build(),Reader.builder().name("bbb").age(12).build());
//        Article article = Article.builder()
//                .id(id)
//                .author("mqxu")
//                .content("SpringBoot 从青铜到王者")
//                .title("SpringBoot")
//                .createTime(new Date())
//                .readerlist(readerList)
//                .build();
//        log.info("article:" + article);
//        return AjaxResponse.success(article);
//    }
//
//    /**
//     * 增加一篇Article ，使用POST方法(RequestBody方式接收参数)
//     *
//     * @param article article
//     * @param aaa     aaa
//     * @return AjaxResponse
//     */
////    @PostMapping("/articles")
////    public AjaxResponse saveArticle(@RequestBody Article article, @RequestHeader String aaa) {
////        log.info("saveArticle:" + article);
////        log.info("请求头aaa:" + aaa);
////        return AjaxResponse.success(article);
////    }
//
//    /**
//     * 增加一篇Article ，使用POST方法(RequestParam方式接收参数
//     *
//     * @param author     author
//     * @param title      title
//     * @param content    content
//     * @param createTime createTime
//     * @return AjaxResponse
//     */
//    @PostMapping("/articles")
//    public AjaxResponse saveArticle(@RequestParam String author, @RequestParam String title, @RequestParam String content, @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") @RequestParam Date createTime,@RequestParam List<Reader> readerList) {
//        log.info("saveArticle:" + author);
//        log.info("saveArticle:" + title);
//        log.info("saveArticle:" + content);
//        log.info("saveArticle:" + createTime);
//        log.info("saveArticle:" + readerList);
//        return AjaxResponse.success();
//    }
//
//    /**
//     * 更新一篇Article，使用PUT方法，以id为主键进行更新
//     *
//     * @param article article
//     * @return AjaxResponse
//     */
//    @PutMapping("/articles")
//    public AjaxResponse updateArticle(@RequestBody Article article) {
//        if (article.getId() == null) {
//            log.error("没有id");
//            //article.id是必传参数，因为通常根据id去修改数据
//        }
//        log.info("updateArticle:" + article);
//        return AjaxResponse.success();
//    }
//
//    /**
//     * 删除一篇Article，使用DELETE方法，参数是id
//     *
//     * @param id id
//     * @return AjaxResponse
//     */
//    @DeleteMapping("/articles/{id}")
//    public AjaxResponse deleteArticle(@PathVariable("id") Long id) {
//        log.info("deleteArticle:" + id);
//        return AjaxResponse.success();
//    }
    @GetMapping("{id}")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        List<Reader> readerList = List.of(Reader.builder().name("aaa").age(12).build(), Reader.builder().name("bbb").age(13).build());
        Article article = Article.builder()
                .id(id)
                .author("mqxu")
                .content("SpringBoot 从青铜到王者")
                .title("SpringBoot")
                .createTime(new Date()).build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    @GetMapping()
    public AjaxResponse getArticleByParam(@RequestParam("id") long id) {
        List<Reader> readerList = List.of(Reader.builder().name("aaa").age(12).build(), Reader.builder().name("bbb").age(13).build());
        Article article = Article.builder()
                .id(id)
                .author("mqxu")
                .content("SpringBoot 从青铜到王者")
                .title("SpringBoot")
                .createTime(new Date()).build();
        log.info("article:" + article);
        return AjaxResponse.success(article);
    }

    @GetMapping("all")
    public AjaxResponse selectAll() {
        List<Reader> readerList = List.of(Reader.builder().name("aaa").age(12).build(), Reader.builder().name("bbb").age(13).build());
        Article article = Article.builder()
                .id(111L)
                .author("mqxu")
                .content("SpringBoot")
                .title("SpringBoot")
                .createTime(new Date())
                .build();
        Article article2 = Article.builder()
                .id(222L)
                .author("mqxu")
                .content("Java")
                .title("Java")
                .createTime(new Date())
                .build();
        return AjaxResponse.success(List.of(article, article2));
    }


    /**
     * 增加一篇Article ，使用POST方法(RequestBody方式接收参数)
     *
     * @param article article
     * @return AjaxResponse
     */
    @PostMapping("body")
    public AjaxResponse saveArticleByJsonBody(@RequestBody Article article) {
        log.info("saveArticle:" + article);
        return AjaxResponse.success(article);
    }

//    /**
//     * 增加一篇Article ，使用POST方法(RequestParam方式接收参数
//     *
//     * @param author     author
//     * @param title      title
//     * @param content    content
//     * @param createTime createTime
//     * @return AjaxResponse
//     */
//    @PostMapping("param")
//    public AjaxResponse saveArticleByParams(
//            @RequestParam long id,
//            @RequestParam(value = "author", defaultValue = "mqxu", required = false) String author,
//            @RequestParam String title,
//            @RequestParam String content,
//            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//            @RequestParam Date createTime)
//
//    {
//        Article article = Article.builder()
//                .id(id)
//                .title(title)
//                .author(author)
//                .content(content)
//                .createTime(createTime)
//
//                .build();
//        return AjaxResponse.success(article);
//    }
//
//    @PostMapping("form")
//    public AjaxResponse saveArticleByFormData(@RequestParam("formData") String formData) {
//        log.info("formData: " + formData);
//        // 用Jackson反序列化将字符串转为Java对象
//        ObjectMapper mapper = new ObjectMapper();
//        Article article = null;
//        try {
//            article = mapper.readValue(formData, Article.class);
//            log.info("article: " + article);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        return AjaxResponse.success(article);
//    }

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
