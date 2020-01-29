package lab1;

public class Insect {
	public static final int DEFAULT_NUMBER_OF_TERRARIUMS = 4;
// default fields
	private static final String REGION_OF_RESIDENCE_OF_INSECT = "tropic regions";
	private static final String TYPE_OF_FOOD_INSECT_CONSUMES = "other insects";
	private static final int SIZE_IN_LENGTH_OF_ADULT_INSECT = 5;
	private static final String NAME_OF_SUBCLASS = "Pterygota";
	private static final int WEIGHT_IN_GRAMS = 5;
	private static final double SPEED_IN_METERS_PER_SECOND = 0.25;
	private static final String NAME_OF_INSECT = "Mantis religiosa";
//given fields
	private String nameOfInsect;
	private double speedInMetersPerSecond;
	private int weightInGrams;
// 2 additional private fields
	private String nameOfSubClass;
	private int sizeInLengthOfAdultInsect;
//static field
	public static int numberOfTheseInsects;
// 2 additional protected fields
	protected String typeOfFoodInsectConsumes;
	protected String regionOfResidenceOfInsect;

//getters and setters for private fields
	public String getNameOfInsect() {
		return nameOfInsect;
	}

	public void setNameOfInsect(String nameOfInsect) {
		this.nameOfInsect = nameOfInsect;
	}

	public double getSpeedInMetersPerSecond() {
		return speedInMetersPerSecond;
	}

	public void setSpeedInMetersPerSecond(double speedInMetersPerSecond) {
		this.speedInMetersPerSecond = speedInMetersPerSecond;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public String getNameOfSubClass() {
		return nameOfSubClass;
	}

	public void setNameOfSubClass(String nameOfSubClass) {
		this.nameOfSubClass = nameOfSubClass;
	}

	public int getSizeInLengthOfAdultInsect() {
		return sizeInLengthOfAdultInsect;
	}

	public void setSizeInLengthOfAdultInsect(int sizeInLengthOfAdultInsect) {
		this.sizeInLengthOfAdultInsect = sizeInLengthOfAdultInsect;
	}

	public static int getNumberOfTheseInsects() {
		return numberOfTheseInsects;
	}

	public static void setNumberOfTheseInsects() {
		Insect.numberOfTheseInsects = numberOfTheseInsects;
	}

//constructor with fields
	public Insect(String nameOfInsect, double speedInMetersPerSecond, int weightInGrams, String nameOfSubClass,
			int sizeInLengthOfAdultInsect, String typeOfFoodInsectConsumes, String regionOfResidenceOfInsect) {
		this.nameOfInsect = nameOfInsect;
		this.speedInMetersPerSecond = speedInMetersPerSecond;
		this.weightInGrams = weightInGrams;
		this.nameOfSubClass = nameOfSubClass;
		this.sizeInLengthOfAdultInsect = sizeInLengthOfAdultInsect;
		this.typeOfFoodInsectConsumes = typeOfFoodInsectConsumes;
		this.regionOfResidenceOfInsect = regionOfResidenceOfInsect;
	}

//constructor with 4 fields
	public Insect(String nameOfInsect, double speedInMetersPerSecond, int weightInGrams, String nameOfSubClass) {
		this(nameOfInsect, speedInMetersPerSecond, weightInGrams, nameOfSubClass, SIZE_IN_LENGTH_OF_ADULT_INSECT,
				TYPE_OF_FOOD_INSECT_CONSUMES, REGION_OF_RESIDENCE_OF_INSECT);
	}

//default constructor
	public Insect() {
		this(NAME_OF_INSECT, SPEED_IN_METERS_PER_SECOND, WEIGHT_IN_GRAMS, NAME_OF_SUBCLASS,
				SIZE_IN_LENGTH_OF_ADULT_INSECT, TYPE_OF_FOOD_INSECT_CONSUMES, REGION_OF_RESIDENCE_OF_INSECT);
	}

//method toString
	@Override
	public String toString() {
		return "Insect [Latin name of insect=" + nameOfInsect + ", Speed(m/s)=" + speedInMetersPerSecond
				+ ",Weight(grams)=" + weightInGrams + ", Name of subclass=" + nameOfSubClass
				+ ", Length of adult insect=" + sizeInLengthOfAdultInsect + ", Type of food insect consumes="
				+ typeOfFoodInsectConsumes + ", Region of residence of insect=" + regionOfResidenceOfInsect + "]";
	}

//static and non static methods of printing field
	public static String printStaticNumberOfTheseInsects() {
		return "Number of these insects=" + numberOfTheseInsects;
	}

	public String printNumberOfTheseInsects() {
		return "Number of these insects=" + numberOfTheseInsects;
	}
	
	public void resetValues(String nameOfInsect, double speedInMetersPerSecond, int weightInGrams,
			String nameOfSubClass, int sizeInLengthOfAdultInsect, String typeOfFoodInsectConsumes,
			String regionOfResidenceOfInsect) {
		this.nameOfInsect = nameOfInsect;
		this.speedInMetersPerSecond = speedInMetersPerSecond;
		this.weightInGrams = weightInGrams;
		this.nameOfSubClass = nameOfSubClass;
		this.sizeInLengthOfAdultInsect = sizeInLengthOfAdultInsect;
		this.typeOfFoodInsectConsumes = typeOfFoodInsectConsumes;
		this.regionOfResidenceOfInsect = regionOfResidenceOfInsect;
	}

}

