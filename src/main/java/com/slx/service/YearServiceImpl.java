package com.slx.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slx.bean.YearCheck;
import com.slx.mapper.YearMapper;

@Service
@Transactional
public class YearServiceImpl implements YearService {
	@Resource
	private YearMapper yMapper;

	public List<YearCheck> selectById(Map<String, Object> map) {
		return yMapper.selectById(map);
		
		
	}

	public YearCheck queryById(int id) {
		// TODO Auto-generated method stub
		return yMapper.queryById(id);
	}

	public int update(YearCheck y) {
		// TODO Auto-generated method stub
		return yMapper.update(y);
	}
	
	
}
