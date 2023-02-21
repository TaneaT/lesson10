public class Main {
    public static void main(String[] args) {

        Elefant elefant = new Elefant();

        System.out.println("The elephant is eating " + elefant.eat());
        System.out.println("The elephant is weighting " + elefant.approxWeight() + " kg");
        System.out.println("The elephant is walking " + elefant.walk(25) + " km per day");

        Elefant elefant1 = new Elefant();

        System.out.println("The elephant is eating: " + elefant1.typeOfHerbs());
        System.out.println("The elephant is consuming " + elefant1.amountOfFood() + " kg of food per day");

    }
}