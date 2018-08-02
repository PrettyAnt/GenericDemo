package cn.wb;

import cn.wb.imp.IFactory;

public class Factory implements IFactory<String>{

	@Override
	public void getData() {
		System.out.println("---------getData----------");
	}

	@Override
	public String getGenericData() {
		return "---------getGenericData----------";
	}

}
