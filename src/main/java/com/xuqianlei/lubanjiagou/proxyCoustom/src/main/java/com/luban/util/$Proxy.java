package com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.util;
import com.xuqianlei.lubanjiagou.proxyCoustom.src.main.java.com.luban.dao.LubanDao;
public class $Proxy implements LubanDao{
	private LubanDao target;
	public $Proxy (LubanDao target){
		this.target =target;
	}
	public void query() {
		System.out.println("log");
		target.query();
	}
}