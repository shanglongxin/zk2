package com.slx.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;
import com.slx.bean.YearCheck;
import com.slx.mapper.YearMapper;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		YearMapper mapper = ac.getBean(YearMapper.class);
		
		List<Object[]> list = IOUtils.readFile("a.txt", "\t");
		for (Object[] objects : list) {
			//System.out.println(Arrays.toString(objects));
			
			if(StringUtil.isNumber(objects[0]+"")){
				
					YearCheck y = new YearCheck(Integer.parseInt(objects[0]+""), objects[1]+"", objects[2]+"", objects[3]+"", objects[4]+"", objects[5]+"", objects[6]+"", objects[7]+"", objects[8]+"", objects[9]+"", objects[10]+"");
					mapper.addYear(y);
				
			}
			
			
		}
		
	}
}
