package com.sandzhang.toywiki.core.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sandzhang.toywiki.core.entity.User;

public interface UserDAO {

    @Insert("insert into user(name,email,password) values(#{name},#{email},#{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    public void insert(User user);

    @Select("SELECT * FROM user WHERE id = #{id}")
    public User findUserById(@Param("id") Integer id);

    @Select("SELECT * FROM user WHERE name = #{name}")
    public User findUserByName(@Param("name") String name);

    @Select("SELECT * FROM user WHERE email = #{email}")
    public User findUserByEmail(@Param("email") String email);
}
