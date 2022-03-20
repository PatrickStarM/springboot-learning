package com.mth.boot.orm.entity;

import com.mth.boot.orm.listener.DataBaseAuditListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/18
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners({DataBaseAuditListener.class})
public class Article implements Serializable {
    @Serial
    private static final long serialVersionUID = -3317203987154803161L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String author;

    private String title;

    private String thumbnail;

    private String content;

    @Column(name = "create_time", updatable = false)
    private Date createTime;

    private Date updateTime;
}
