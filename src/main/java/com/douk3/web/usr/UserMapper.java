package com.douk3.web.usr;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	public int rowCount();
	public List<User> selectAll();
}
