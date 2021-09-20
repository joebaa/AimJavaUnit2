public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This Program shows coversions for pounds in kilograms by using a loop");
        Double lbs_per_kilo = 2.2;
        System.out.println("Kilograms    Pounds");
        for (int i = 1; i <= 15; i += 2) {
			System.out.printf(
				"%-15d%6.2f\n", i, (i * lbs_per_kilo));  	
		}  
        System.out.println("\nGoodbye");
    }
}
