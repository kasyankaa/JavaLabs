package lab1;

public class InsectRealization {
	public static void main(String[] args) {
		Insect.numberOfTheseInsects = 12;
		// non static method
		Insect firstTerrarium = new Insect("Lucanus Cervus", 0.5, 30, "Lucaninae", 10, "organic foods", "Europe");
		Insect secondTerrarium = new Insect("Nepidae", 0.15, 10, " Ranatrinae");
		Insect thirdTerrarium = new Insect();
		System.out.println();
		System.out.println(firstTerrarium + "\n");
		System.out.println(secondTerrarium + "\n");
		System.out.println(thirdTerrarium + "\n");
		System.out.println(Insect.printStaticNumberOfTheseInsects() + "\n");
		// static method
		Insect[] arrayOfTerrariums = new Insect[Insect.DEFAULT_NUMBER_OF_TERRARIUMS];
		int numberOfTerrarium = 0;
		do {
			arrayOfTerrariums[numberOfTerrarium] = new Insect();
			numberOfTerrarium++;

		} while (numberOfTerrarium < Insect.DEFAULT_NUMBER_OF_TERRARIUMS);

		for (Insect currentNumberOfTerrarium : arrayOfTerrariums) {
			System.out.println(currentNumberOfTerrarium.toString() + "\n");
		}
		System.out.println(firstTerrarium.printNumberOfTheseInsects());
	}

}
