package com.sllc.ssm.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.sllc.ssm.entity.User;

@Mapper
public interface UserinfoDao {
	
 	@Select("SELECT * FROM user WHERE account = #{account}")
    User findByUsername(@Param(value = "account") String account);
}
