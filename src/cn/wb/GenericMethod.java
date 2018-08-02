package cn.wb;
/**
 * 泛型方法
 * @author fangli
 *
 */
public class GenericMethod {
	public <K,V>void f(K k,V v){
		System.out.println(k.getClass().getSimpleName()
				+"\n---------------\n\n"+v.getClass().getSimpleName());
	}
}
