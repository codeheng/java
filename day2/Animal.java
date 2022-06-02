public class Animal {
	private String name;
	private int age;
	private float height;
	public static String feature = "动物都会动"; 


	public static void main(String[] args) { 
		Animal animal = new Animal();
		animal.name = "小猫";
		animal.age = 2;
		animal.height = 10;
		System.out.println("name:" +animal.name );
		System.out.println("age ：" +animal.age);
		System.out.println("height:" +animal.height );
		System.out.println("feature:" +feature );

	}
}