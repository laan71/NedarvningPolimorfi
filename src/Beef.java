public class Beef extends Meat implements Tilbered {

    void tilberedes() {
        System.out.println("Skal tilberedes");
        System.out.println("Kødet skal have en kerne temperatur på: Rød: 52-55°C, Medium: 60-65°C, Gennemstegt: 69-71°C. ");

    }

    String country = "Denmark";
    String type = "Ribeye";
    String name = "Black Angus";
    int weight = 250;
    boolean freeRange = true;
    boolean skalTilberedes = true;


}