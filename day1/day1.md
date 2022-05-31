# day1

- 在你的电脑上装好Jdk1.8 开发环境
- 请在记事本或者notepad++等编辑器写出完整的Java版本 Hello World代码
- 请在 cmd完成 HelloWorld.java 的编译和运行
- 可以在代码里打印中文，看看是否会出现报错

=================================================================



1. 相关环境的配置

![image-20220601072845645](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206010728730.png)

- 测试

  终端分别输入`javac` 和 `java` 

  ![image-20220601073026363](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206010730417.png)

![image-20220601073035412](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206010730453.png)

> 当出现时，表示环境变量已生效

2. 在`E:\code\java\day1`创建了`Hello.java`的文件 

   使用的`EditPlus`

   ```java
   public class Hello {
   	public static void main(String[] args) {
   		System.out.println("Hello World!");
   	}
   }
   ```

   ![image-20220601073229621](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206010732654.png)



3. 利用控制台对其进行编译运行

   如图所示，`javac` : 将其编程成字节码文件 `java` 执行该文件

![image-20220601072921730](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206010729838.png)



4. 是否乱码

添加`System.out.println("你好");` 并没出现乱码

![image-20220601073738769](https://cdn.jsdelivr.net/gh/codeheng/personPic@main/imgBlog/202206010737829.png)