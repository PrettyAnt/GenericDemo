package cn.wb;
/**
 * 
 * @author fangli
 *
 * @param <E>
 * 模板设计模式
 */
public class Box<T> {
	private T data;

	public Box(T data) {
		setData(data);
	}

	private void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	@Override
	public String toString() {
		return "Box [data=" + data + "]";
	}

}
