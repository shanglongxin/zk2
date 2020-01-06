package com.slx.service;

import java.util.List;
import java.util.Map;

import com.slx.bean.YearCheck;

public interface YearService {

	List<YearCheck> selectById(Map<String, Object> map);

	YearCheck queryById(int id);

	int update(YearCheck y);

}
