package assignment;
@FunctionalInterface
 interface MyFunctionalInterface {
	public String sayHello(String x);

}
public class Testwer{
	public static void main(String args[]) {
		MyFunctionalInterface msg =(str) ->{
			return str;
		};
		System.out.println(msg.sayHello("tilaka"));
	}
}
