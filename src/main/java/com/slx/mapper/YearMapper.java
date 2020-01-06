package com.slx.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.slx.bean.YearCheck;

public interface YearMapper {
	//添加
	void addYear(@Param("y")YearCheck y);
	//条件查询
	List<YearCheck> selectById(Map<String, Object> map);
	//回显
	YearCheck queryById(@Param("id")int id);
	//修改
	int update(YearCheck y);
	
	
}
