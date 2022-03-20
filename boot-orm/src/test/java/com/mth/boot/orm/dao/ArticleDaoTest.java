package com.mth.boot.orm.dao;

import com.mth.boot.orm.entity.Article;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/18
 **/
@SpringBootTest
@ExtendWith(SpringExtension.class)
class ArticleDaoTest {
    @Resource
    private ArticleDao articleDao;

    @Test
    void save() {
        Article article = Article.builder()
                .author("mth")
                .title("Java")
                .content("Java从入门到入土")
                .build();
        int rows = articleDao.save(article);
        assertEquals(1,rows);

    }

    @Test
    void deleteById() {
    }

    @Test
    void updateById() {
    }

    @Test
    void findById() {
    }
}