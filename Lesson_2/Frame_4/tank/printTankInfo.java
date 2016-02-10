public class printTankInfo {
	public static void main(String[] args) {
		Tank tt = new Tank();
		fillTaknInfo(tt);
		printTankInfo(tt);
	}

	private static void fillTaknInfo(Tank tt) {
		tt.color = "dark";
		tt.crew = 3;
		tt.maxSpeed = 150;
	}

	private static void printTankInfo(Tank tt) {
		System.out.println("Nash Tank has: " + tt.color + " color.");
		System.out.println("Ekipag: " + tt.crew + " people");
		System.out.println("MexSpeed: " + tt.maxSpeed);
	}
}