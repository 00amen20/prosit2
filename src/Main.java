public class Main {
    public static void main(String[] args) {


        Animal lion = new Animal();

        lion.family = "Felidae";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "My Zoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 20;
    }
}