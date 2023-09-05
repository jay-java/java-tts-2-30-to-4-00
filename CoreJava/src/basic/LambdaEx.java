package basic;
interface calling{
	public String run(String name);
}
public class LambdaEx {
	public static void main(String[] args) {
//		calling c =()->{
//			System.out.println("hello run function");
//		};
//		c.run();
//		calling c = (i,j)->(i+j);
//		System.out.println(c.run(1,2));
		
		calling c =(name)->{
			return "hello "+name;
		};
		System.out.println(c.run("java"));
	}
}
