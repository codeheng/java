//测试实例变量和静态变量
public class Test {
	public static int staticInt = 1;
	public int instanceInt = 1;
	public Test() {
		System.out.println("实例变量 = "  + (instanceInt++) + " 静态变量 = " +(staticInt++)); 
	}
	public static void main(String[] args) { 
		Test test = new Test();
		Test test1 = new Test();
		Test test2 = new Test();
	}
}