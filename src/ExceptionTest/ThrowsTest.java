package ExceptionTest;

public class ThrowsTest {

	public ThrowsTest() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void test1() {

		try {

			test2();

			// String[] strAry = { "a", "b" };

			// String str = strAry[5];

		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("out of bound");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("NullPointer");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("formatErr");
		} catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println("classCastErr");
		} catch (StackOverflowError e) {
			// TODO: handle exception
			System.out.println("overflow");
		}

	}

	public void test2() {

		loop();

		Object x = new Integer(0);
		System.out.println((String) x);

		String num = "1234567890";
		byte b = Byte.valueOf(num);

		Object o = null;
		String s = o.toString();

		String[] strAry = { "a", "b" };
		String str = strAry[5];

	}

	void loop() {

		test2();

	}

}
