# GenericDemo
泛型demo

# 代码举例

## 模板设计模式

    /**
     * 
     * @author chenyu
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
    
    
## 泛型方法


     /**
     * 泛型方法
     * @author chenyu
     *
     */
    public class GenericMethod {
    	public <K,V>void f(K k,V v){
    		System.out.println(k.getClass().getSimpleName()
    				+"\n---------------\n\n"+v.getClass().getSimpleName());
    	}
    }
    
## 泛型接口

    /**
     * 泛型接口
     * @author chenyu
     *
     */
    public interface ITest<T,K> {
    	List<T> getData(T t);
    	T getNums(K k);
    	void onResponse(T t);
    }
    
    
    
    
    
    
