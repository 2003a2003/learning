public class GreetingService {
	
	public static void main(String[] args) {
		if(args.length < 1){
			System.out.println("Mistake. Esli vi chotitte chtobi programma zapustilas");
			System.out.println("You need to add some parameter after end of the line");
			System.out.println("Example: \"java GreetingSrvice Alex\"");
		}else{
			System.out.println("Hello " + args[0]);
			System.out.println();
			System.out.println("You are well done. Take hold of candy.");
		}
	}
}