package cn.wb.imp;

public interface IResponse<T> {
	void onResponseData(T t);
}
