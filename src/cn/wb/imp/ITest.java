package cn.wb.imp;

import java.util.List;

public interface ITest<T,K> {
	List<T> getData(T t);
	T getNums(K k);
	void onResponse(T t);
}
