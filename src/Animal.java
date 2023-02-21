public interface Animal {


    default int walk(int km){
        km = 0;
        return km;
    }

    static String description (){
        return "Has different color";
    }

    String eat();

    int approxWeight();


}
