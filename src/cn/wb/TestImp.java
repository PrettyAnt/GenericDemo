package cn.wb;

import java.util.ArrayList;
import java.util.List;

import cn.wb.imp.IResponse;
import cn.wb.imp.ITest;

public class TestImp implements ITest<String,Integer>{
	private IResponse<String> iResponse;

	public TestImp(IResponse<String> iResponse){
		this.iResponse=iResponse;
	}
	@Override
	public List<String> getData(String str) {
		List<String> list=new ArrayList<>();
		list.add(str+"a");
		list.add(str+"b");
		list.add(str+"c");
		list.add(str+"d");
		return list;
	}

	@Override
	public String getNums(Integer num) {
		
		return "返回结果:"+num;
	}

	@Override
	public void onResponse(String str) {
		System.out.println(str+"--->>>Success");
		str="Success";
		iResponse.onResponseData(str);
	}
	
}
