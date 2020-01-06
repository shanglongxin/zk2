package com.slx.bean;

import java.util.Date;

public class YearCheck {
	private Integer id;
	private String guan;
	private String desc;
	private String name;
	private String goods;
	private String addr;
	private String res;
	private String ctime;
	private String ydate;
	private String tai;
	private String bei;
	

	
	public YearCheck() {
		super();
	}
	public YearCheck(Integer id, String guan, String desc, String name, String goods, String addr, String res,
			String ctime, String ydate, String tai, String bei) {
		super();
		this.id = id;
		this.guan = guan;
		this.desc = desc;
		this.name = name;
		this.goods = goods;
		this.addr = addr;
		this.res = res;
		this.ctime = ctime;
		this.ydate = ydate;
		this.tai = tai;
		this.bei = bei;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGuan() {
		return guan;
	}
	public void setGuan(String guan) {
		this.guan = guan;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}


	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public String getYdate() {
		return ydate;
	}
	public void setYdate(String ydate) {
		this.ydate = ydate;
	}
	public String getTai() {
		return tai;
	}
	public void setTai(String tai) {
		this.tai = tai;
	}
	public String getBei() {
		return bei;
	}
	public void setBei(String bei) {
		this.bei = bei;
	}
	@Override
	public String toString() {
		return "YearCheck [id=" + id + ", guan=" + guan + ", desc=" + desc + ", name=" + name + ", goods=" + goods
				+ ", addr=" + addr + ", res=" + res + ", ctime=" + ctime + ", ydate=" + ydate + ", tai=" + tai
				+ ", bei=" + bei + "]";
	}
	
	
}
