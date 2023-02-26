public class SimpleArray {
    public static void main(String[] args) {
        String[] animals = new String[7];
        animals[0] = "Lion";
        animals[1] = "Elephant";
        animals[2] = "Fox";
        animals[3] = "Rabbit";
        animals[4] = "Wolf";
        animals[5] = "Bear";
        animals[6] = "Giraffe";

        String animal = animals[3];
        System.out.println(animal);

        int numberOfElements = animals.length;

        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
    }
}
