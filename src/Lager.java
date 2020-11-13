import java.util.ArrayList;

public class Lager {

    ArrayList<Varer> vareLager = new ArrayList<Varer>();

    public void fyldOp() {                                  // Level 1
        // Første måde
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

        // Anden måde
        vareLager.add(new Peas());
        vareLager.add(new Peas());
        vareLager.add(new Lilies());
        vareLager.add(new Chicken());
        vareLager.add(new Lilies());

    }

    public void antalVarer() {
    }

     public void visVarer() {                               // Level 2
         System.out.println(vareLager);
     }                                                     

    public int antalApple() {                               // Level 3
        return 0;
    }                  

    public int antalAf(String type) {                       // Level 3
        return 0;
    }          

}
