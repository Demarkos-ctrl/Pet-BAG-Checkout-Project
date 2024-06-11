public class Pet {
    // Attributes
    private String petType;
    private String petName;
    private int petAge;
    private int daysStay;

    // Constructor
    public Pet(String petType, String petName, int petAge, int daysStay) {
        this.petType = petType;
        this.petName = petName;
        this.petAge = petAge;
        this.daysStay = daysStay;
    }

    // Getter for petType
    public String getPetType() {
        return petType;
    }

    // Setter for petType
    public void setPetType(String petType) {
        this.petType = petType;
    }

    // Getter for petName
    public String getPetName() {
        return petName;
    }

    // Setter for petName
    public void setPetName(String petName) {
        this.petName = petName;
    }

    // Getter for petAge
    public int getPetAge() {
        return petAge;
    }

    // Setter for petAge
    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    // Getter for daysStay
    public int getDaysStay() {
        return daysStay;
    }

    // Setter for daysStay
    public void setDaysStay(int daysStay) {
        this.daysStay = daysStay;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Pet object
        Pet myPet = new Pet("Dog", "Buddy", 5, 3);

        // Test getters
        System.out.println("Pet Type: " + myPet.getPetType());
        System.out.println("Pet Name: " + myPet.getPetName());
        System.out.println("Pet Age: " + myPet.getPetAge());
        System.out.println("Days Stay: " + myPet.getDaysStay());

        // Test setters
        myPet.setPetType("Cat");
        myPet.setPetName("Whiskers");
        myPet.setPetAge(2);
        myPet.setDaysStay(5);

        // Test getters again
        System.out.println("Updated Pet Type: " + myPet.getPetType());
        System.out.println("Updated Pet Name: " + myPet.getPetName());
        System.out.println("Updated Pet Age: " + myPet.getPetAge());
        System.out.println("Updated Days Stay: " + myPet.getDaysStay());
    }
}

