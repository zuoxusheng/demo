package cn.tedu.sample2.mapper;

import cn.tedu.sample2.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

	User findByUsername(@Param("username") String username);
	
}
