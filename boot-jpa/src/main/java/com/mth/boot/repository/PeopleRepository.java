package com.mth.boot.repository;

import com.mth.boot.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @description:
 * @author: mth
 * @date: 2022/3/19
 **/

public interface PeopleRepository extends JpaRepository<People, Integer> {
    //find,read,get
    //查找全部
    @Override
    List<People> findAll();

    //根据firstName查找
    List<People> findByFirstName(String firstName);

    //根据firstName和lastName查找
    People findByFirstNameAndLastName(String firstName, String lastName);

    //根据firstName或lastName查找
    People[] findByLastNameOrFirstName(String lastName, String firstName);

    //根据firstName查找它是否存在数据库里
    People findByFirstNameIs(String firstName);

    //根据firstName查找它是否存在数据库里
    People findByFirstNameEquals(String firstName);

    //在Age数值age到age2之间的数据
    List<People> findByAgeBetween(Integer age1, Integer age2);

    //小于指定age数值之间的数据
    List<People> findByAgeLessThan(Integer age);

    //小于等于指定age数值的数据
    List<People> findByAgeLessThanEqual(Integer age);

    //大于指定age数值之间的数据
    List<People> findByAgeGreaterThan(Integer age);

    //大于或等于指定age数值之间的数据
    List<People> findByAgeGreaterThanEqual(Integer age);

    //在指定age数值之前的数据类似关键字<LessThan>
    List<People> findByAgeAfter(Integer age);

    //在指定age数值之后的数据类似关键字<GreaterThan>
    List<People> findByAgeBefore(Integer age);

    //返回age字段为空的数据
    List<People> findByAgeIsNull();

    //返回age字段不为空的数据
    List<People> findByAgeNotNull();

    //类似findByFirstName
    List<People> findByFirstNameLike(String firstName);

    //类似findByFirstNameNot
    List<People> findByFirstNameNotLike(String firstName);

    //返回不是指定firstName的所有数据
    List<People> findByFirstNameNot(String firstName);

    //查找数据库中指定类似的名字(如：输入一个名字"M" Jpa会返回多个包含M开头的名字的数据源)<类似数据库模糊查询>
    List<People> findByFirstNameStartingWith(String firstName);

    //查找数据库中指定不类似的名字(同上)
    List<People> findByFirstNameEndingWith(String firstName);

    //查找包含的指定数据源(这个与以上两个字段不同的地方在与它必须输入完整的数据才可以查询)
    List<People> findByFirstNameContaining(String firstName);

    //根据age选取所有的数据源并按照LastName进行升序排序
    List<People> findByAgeOrderByFirstName(Integer age);

    //返回不是指定age的所有数据
    List<People> findByAgeNot(Integer age);

    //查找包含多个指定age返回的数据
    List<People> findByAgeIn(List<Integer> age);

    //查找包含多个指定age返回的数据
    List<People> findByAgeNotIn(List<Integer> age);
    List<People> findByFirstNameIgnoreCase(String firstName);
//    List<People> findByActiveTrue();
//    List<People> findByActiveFalse();
}
