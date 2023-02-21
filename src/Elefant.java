public class Elefant extends Erbivor implements Animal{

    @Override
    public int walk(int km) {
        Animal.super.walk(km);
        return km;
    }

    @Override
    public String eat() {
        return "herbs";
    }

    @Override
    public int approxWeight() {
        return 4000;


        }

    @Override
    String typeOfHerbs() {
        return " fruits, grass, leaves ";
    }


}

