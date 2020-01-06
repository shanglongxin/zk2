package com.slx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.slx.bean.YearCheck;
import com.slx.service.YearService;

@Controller
public class YearController {
	@Resource
	private YearService yService;
	//查询
	@RequestMapping("query")
	public String query(Model m,YearCheck y,@RequestParam(defaultValue="1")int pageNum,@RequestParam("g1")int g1,@RequestParam("g2")int g2,@RequestParam("t1")String t1,@RequestParam("t2")String t2){
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("y", y);
		map.put("g1", g1);
		map.put("g2", g2);
		map.put("t1", t1);
		map.put("t2", t2);
		
		PageHelper.startPage(pageNum, 3);
		List<YearCheck> list = yService.selectById(map);
		PageInfo<YearCheck> plist = new PageInfo<YearCheck>(list);
		m.addAttribute("plist", plist);
		
		return "list";
	}
	//回显
	@RequestMapping("check")
	public String query(Model m,@RequestParam("id")int id){
		
		
		YearCheck y = yService.queryById(id);
		m.addAttribute("y", y);
		
		return "check";
	}
	//修改
	@RequestMapping("update")
	public String update(YearCheck y){
		
		int i=yService.update(y);
		if(i>0){
			return "redirect:query";
		}
		return "check";
	}
	
}
