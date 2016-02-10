public class GreetingService {
	
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println("Mistake. You need to add one parameter \"Your Name\" after end of the line!!!");
        		System.out.println("Example: \"java GreetingSrvice Alex\"");
		}else{
			System.out.println("Hello " + args[0]);
           		System.out.println();
            		System.out.println("Nice to meet you...");
		}
	}
}