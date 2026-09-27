public class ZooManagement {

    public static void main(String[] args) {


        Animal lion = new Animal(
                "Felidae",
                "Simba",
                5,
                true
        );

        Zoo myZoo = new Zoo(
                "My Zoo",
                "Tunis",
                20
        );

        System.out.println("===== ANIMAL =====");
        System.out.println(lion);
        System.out.println();
        System.out.println("===== ZOO =====");
        myZoo.displayZoo();
        Animal elephant = new Animal(
                "Elephantidae",
                "Dumbo",
                8,
                true
        );

        Animal eagle = new Animal(
                "Accipitridae",
                "Eagle",
                3,
                false
        );

        Animal tiger = new Animal(
                "Felidae",
                "Tiger",
                6,
                true
        );

        System.out.println();
        System.out.println("===== LISTE DES ANIMAUX =====");

        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(eagle);
        System.out.println(tiger);
        System.out.println();
        System.out.println("===== INFORMATIONS DU ZOO =====");

        myZoo.displayZoo();

        System.out.println();
        System.out.println("===== AFFICHAGE DIRECT DU ZOO =====");
        System.out.println(myZoo);
        System.out.println();
        System.out.println("===== AFFICHAGE DIRECT DE L'ANIMAL =====");

        System.out.println(lion);
    }
}