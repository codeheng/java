public class Main {
	public static void main(String[] args) {
		//可通过数据类型的封装类，获取相关信息
		System.out.println("byte的位数："  + Byte.SIZE); //8即1个字节
		System.out.println("int的位数："  + Integer.SIZE); //32即四个字节
		System.out.println("char的位数："  + Character.SIZE);//16 即两个字节
		System.out.println("int最大值："  + Integer.MAX_VALUE); //2147483647 即2^31 - 1
		System.out.println("int最小值："  + Integer.MIN_VALUE); //-2147483648 即 -2^31

		//四则运算
		// + 
		int a = 2,b = 1,sum;
		sum = a + b;
		System.out.println("sum = " +sum);
		// - 
		double x = 2.9, y = 1;
		System.out.println("x - y = " + (x - y) );
		// *
		System.out.println("x * 2 = " + x*2);
		// /
		System.out.println("x / a = " + (x / a));

		//类型转换
		short a1 = 1,b1 = 2,res;
		//错误: 不兼容的类型: 从int转换到short可能会有损失res = a1 + b1;
		//res = a1 + b1;
		res = (short) (a1 + b1);
		System.out.println("res = " + res);
		//1.自动类型转换
		int myInt = 1;
		//自动进行了转换，int -> double/float,打印1.0
		double d = myInt;
		//float f = myInt;

		// 错误: 不兼容的类型: 从int转换到char可能会有损失
		//char c = myInt;
		// 不兼容的类型: 从int转换到short可能会有损失
		//short s = myInt;
		System.out.println(d); 
		//2.手动(强制)类型转换
		short s =(short) myInt;
		s = (short)x;// x为double => short 
		long l = (long)x; // double => long
		myInt = (int)x; //double => int
		byte mybyte = (byte)x; //double => byte
		char myChar = (char)x;//double => char,此时若打印出现乱码，原因是：会通过ASCII进行对应查找
		myInt = 97; // 97 对应ASCII为a
		myChar = (char) myInt;
		System.out.println(myChar);  //此时打印a


		
	
	}

}