package com.dkx.search.db;

import com.dkx.search.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;


@Mapper
public interface TestDao {

    @Select("select * from user")
    List<User> selectUserList(Map<String, Object> map);
}
