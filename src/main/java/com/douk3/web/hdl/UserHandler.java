package com.douk3.web.hdl;

import org.apache.ibatis.annotations.Insert;

import com.douk3.web.usr.User;

public interface UserHandler {
	@Insert("insert into user (uid,pwd,uname,birth,gender,tel,pettype) values (\n" + 
			"#{uid}, #{pwd},#{uname},#{birth}, #{gender},#{tel},#{pettype})")
	public void insertUser(User u);
}
