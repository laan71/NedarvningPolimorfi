import java.util.ArrayList;

public class Lager {

    ArrayList<Varer> vareLager = new ArrayList<Varer>();

    public void fyldOp() {                         // Level 1
        Apple a1 = new Apple();
        vareLager.add(a1);

        Beef b1 = new Beef();
        vareLager.add(b1);

        Chicken c1 = new Chicken();
        vareLager.add(c1);

        Lilies l1 = new Lilies();
        vareLager.add(l1);

        Peas p1 = new Peas();
        vareLager.add(p1);

        Roses r1 = new Roses();
        vareLager.add(r1);
    }
    public int antalVarer() {
        return 0; }                                      // Level 1

     public void visVarer() {

     }                                                  // Level 2

    public int antalApple() {
        return 0;
    }                                                  // Level 3

    public int antalAf(String type) {
        return 0;
    }                                                 // Level 3

}
