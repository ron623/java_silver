package ExceptionTest;

public class ThrowTest {

	public ThrowTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void methodA() {

		try {

			System.out.println("call methodB from methodA");
			 methodB();

		} catch (ClassCastException e) {

			System.out.println("Exception has occured! from A");

		} finally {

			System.out.println("finally節 A");
		}

	}

	public void methodB() throws ClassCastException {

		Object o = 1234567890.5;

		// 例外発生想定箇所！！！
		byte i = Byte.valueOf((String) o);

	}

}
