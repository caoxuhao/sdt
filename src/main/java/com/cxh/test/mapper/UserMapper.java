package com.cxh.test.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.cxh.test.domain.User;

@Mapper
public interface UserMapper {
	
    @Select("SELECT * FROM user")
    @Results({
        @Result(property = "id",  column = "id", javaType = String.class),
        @Result(property = "name", column = "name"),
        @Result(property = "email", column = "email"),
        @Result(property = "deptitle", column = "deptitle"),
        @Result(property = "grouptitle", column = "grouptitle"),
        @Result(property = "txtitle", column = "txtitle"),
        @Result(property = "lastLoginTime", column = "last_login_time", javaType = Date.class)
    })
    public List<User> getAll();

//    @Select("SELECT * FROM users WHERE id = #{id}")
//    @Results({
//        @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
//        @Result(property = "nickName", column = "nick_name")
//    })
//    User getOne(Long id);

//    @Insert("INSERT INTO users(userName,passWord,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
//    void insert(User user);
//
//    @Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
//    void update(User user);
//
//    @Delete("DELETE FROM users WHERE id =#{id}")
//    void delete(Long id);

}