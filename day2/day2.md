

# day2

- 学习4类8种 java数据类型

- 使用基本数据类型实现简单的四则运算，并打印结果，例如 int a = 1; int b = 1; int sum = a + b; 

- 类型转换。例如  int转byte，要求全部8种数据类型都自己练习转换至少一次，看看是否报错。思考：short a = 1; short b = 2; 那么a+b 是什么类型

- 学习什么是实例变量、什么是静态变量
- 学习Java修饰符，private | protected | public，static、final、abstract、synchronized、transient、volatile 明确其使用场景和注意事项

- 设计一个Java对象class Animal，包含成员变量：名字 String name、年龄 int age、身高 float height，包含静态变量 String feature = "动物都会动";
- 在main方法中实例化对象Animal，设置它的属性值
- 在CMD中打印Animal所有的属性值

------



1. **八种基本数据类型**

- short  (2字节)
- byte （1字节）
- int (4字节)
- float （4字节）
- long （8字节）
- double （8字节）
- char **（2字节）**
- boolean

```java
public class Main {
	public static void main(String[] args) {
		//可通过数据类型的封装类，获取相关信息
		System.out.println("byte的位数："  + Byte.SIZE); //8即1个字节
		System.out.println("int的位数："  + Integer.SIZE); //32即四个字节
		System.out.println("char的位数："  + Character.SIZE);//16 即两个字节
		System.out.println("int最大值："  + Integer.MAX_VALUE); //2147483647 即2^31 - 1
		System.out.println("int最小值："  + Integer.MIN_VALUE); //-2147483648 即 -2^31
	}
}
```

![image-20220601150755526](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206011507710.png)



2. **四则运算**

```java
//四则运算 （会向高类型进行转换
// 加
int a = 2,b = 1,sum;
sum = a + b;
System.out.println("sum = " +sum);
// 减
double x = 2.9, y = 1;
System.out.println("x - y = " + (x - y) );
// 乘
System.out.println("x * 2 = " + x*2);
// 除
System.out.println("x / a = " + (x / a));
```



3. **类型转换**

```java
//类型转换
short a1 = 1,b1 = 2,res;
res = a1 + b1;
//错误: 不兼容的类型: 从int转换到short可能会有损失res = a1 + b1;
System.out.println("res = " + res);
```

>  **short a = 1; short b = 2; 那么a+b 是什么类型 ？**

应该为`int`类型，在计算过程中，自动进行提升了数据类型

因为`java`在基本类型进行算术运算的时候，会发生**小字节类型向大字节类型转换的现象**。

自动向上转型是按照 `char->int -> long -> float -> double`的顺序。

比如byte+byte=int，short+short=int

可进行强制类型转换`res = (short) (a1 + b1);` 

**两类转换原则**

- **自动转换**（自动）： 将较小的类型转换为较大的类型
  `byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`
- **强制转换**（手动）： 将较大的类型转换为较小的类型
  `double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`

![image-20220601154644253](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206011546305.png)

4. **静态变量 & 实例变量**

静态变量`static`关键字进行修饰，而实例变量前则不需要

- 实例变量属于**某个对象的属性**，必须创建了实例对象，其中的实例变量才会被分配空间，才能使用这个实例变量
- 静态变量不属于某个实例对象，而是属于类，所以也称为**类变量**，只要程序加载了类的字节码，不用创建任何实例对象，静态变量就会被分配空间，静态变量就可以被使用了，静态成员变量的值是**保存在类的内存区域**的公共存储单元，而不是保存在某一个对象的内存区间

> 实例变量**必须创建对象后**才可以通过这个对象来使用，静态变量则可以直接**使用类名**来引用

```java
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
```

![image-20220601155546730](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206011555779.png)

每创建一个对象，则实例变量就会加1

但无论创建多少对象，静态变量只会分配一次



5. **Java修饰符**

   主要分为：类修饰，方法修饰，变量修饰

- **public** : 公共的，每个`java`程序有且只有一个类是，被修饰的成为主类
- **private** ：私有的，`private` 修饰的成员变量只能被该类自身所访问，不能被其它任何类 ( 包括子类 ) 访问
- **protected**: 允许其它包中的子类来访问父类的特定属性

| **访问级别** | **访问控制修饰符** | **同类** | **同包** | **子类(不同包)** | **不同包(其他类)** |
| ------------ | ------------------ | -------- | -------- | ---------------- | ------------------ |
| 公共         | public             | 允许     | 允许     | 允许             | 允许               |
| 受保护       | protected          | 允许     | 允许     | 允许             | 不允许             |
| 默认         | 缺省修饰符         | 允许     | 允许     | 不允许           | 不允许             |
| 私有         | private            | 允许     | 不允许   | 不允许           | 不允许             |

- **abstract**  : 表明类为抽象类或抽象方法，对类的进一步抽象

> 如果一个`class`定义了方法，但没有具体执行代码，这个方法就是抽象方法，抽象方法用`abstract`修饰

- **static** ： 静态修饰符，表明静态方法或静态变量，是属于整个类的，而不属于某个对象
- **final** ： 被其修饰的方法或者变量，**是不可以修改的**，若修饰方法则不可以重写覆盖，防止当前类的子类对父类关键方法的错误定义，保证了程序的安全性和正确性。若修饰变量，则表示执行过程一直不变
- **synchronized**: 通常称为重量级锁,主要用于多线程程序中的协调和同步，可以保证在**同一个时刻**，只有一个线程可以执行某个方法或者某个代码块(主要是对方法或者代码块中存在共享数据的操作)
- **transient** : 用来定义一个暂时性变量，而不能修饰方法和类。将指定` Java`虚拟机认定该暂时性变量不属于永久状态，在类的实例对象的序列化处理过程中会被忽略，生命周期**仅存于调用者的内存中**而不会写到磁盘里进行持久化，用来表示一个成员变量不是该对象序列化的一部分

> **序列化**指的是将对象转换成以字节序列的形式来表示,可以被写到数据库或文件中，也可用于网络传输

- **volatile**  ： **易失 ( 共享 ) 域修饰符** `volatile`是用来说明这个成员变量**可能被几个线程所控制和修改**。轻量级的同步机制，在程序运行过程中，这个成员变量有可能被其它的程序影响或改变它的取值。

  `volatile`更轻量级，因为它不会引起线程上下文的切换和调度



6. 设计

```java
public class Animal {
	private String name;
	private int age;
	private float height;
	public static String feature = "动物都会动"; 

	public static void main(String[] args) { 
        //创建对象
		Animal animal = new Animal();
        //设置值
		animal.name = "小猫";
		animal.age = 2;
		animal.height = 10;
        //打印
		System.out.println("name:" +animal.name );
		System.out.println("age ：" +animal.age);
		System.out.println("height:" +animal.height );
		System.out.println("feature:" +feature );

	}
}
```

![image-20220601165841378](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206011658519.png)