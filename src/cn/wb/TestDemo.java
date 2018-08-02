package cn.wb;

import cn.wb.imp.IResponse;

public class TestDemo implements IResponse<String> {

	public static void main(String[] args) {
		TestDemo testDemo = new TestDemo();
		// testDemo.test1();
		// testDemo.test2();
		// testDemo.test3();
		testDemo.test4();
	}

	private void test4() {
		TestImp test = new TestImp(this);
		// List<String> data = test.getData("wangbei");
		// for (int i = 0; i < data.size(); i++) {
		// System.out.println("结果:" + data.get(i));
		// }
		// System.out.println("wangbei"+test.getNums(26));
		test.onResponse("PostData");
		// MyTest myTest = new MyTest(this);
		// myTest.sendData();
	}

	private void test3() {
		Factory factory = new Factory();
		factory.getData();
		// String genericData = factory.getGenericData();
		// System.out.println(genericData);
	}

	private void test1() {
		Box<Integer> box = new Box<>(6);
		Box<String> box2 = new Box<>("wangbei");
		System.out.println("数据为：" + box.getData() + "谁:" + box2.getData());

		System.out.println("\n-----------------------------\n");
		getSuperData(box);
	}

	private void test2() {
		Box<Integer> box = new Box<>(6);
		GenericMethod genericMethod = new GenericMethod();
		genericMethod.f(8, box);
	}

	private static void getSuperData(Box<? super Integer> box) {
		System.out.println("new数据为：" + box.getData());
	}

	@Override
	public void onResponseData(String t) {
		System.out.println("result:" + t);
	}

}
