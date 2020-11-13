import java.util.Date;


/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Main {

    public static void main(String[] args) {

        Apple a = new Apple();
        a.stykpris = 2.5;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();
        if (a.moden)
            System.out.println("Æble: pris pr. styk: " + a.stykpris + " kr.");
        else
            System.out.println(a + " er ikke modne.");

        Banana b = new Banana();
        b.stykpris = 2.5;
        b.holdbarhed = new Date(1608768000);
        b.smidUd();
        b.moden = true;
        b.coolDown();
        if (b.moden)
            System.out.println("Banan: pris pr. styk: " + b.stykpris + " kr.");
        else
            System.out.println(b + " er ikke modne.");

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Chicken c = new Chicken();
        c.freerange = true;
        c.kgpris = 65;
        c.skalTilberedes = true;
        c.holdbarhed = new Date(1608768000);

        Beef b2 = new Beef();
        b2.freerange = true;
        b2.kgpris = 125;
        b2.skalTilberedes = true;
        b2.holdbarhed = new Date(1608768000);

        Roses r = new Roses();
        r.prisPrBundt = 45;
        r.antalBlomsterPrBundt = 12;
        r.needWater();

        Lilies l = new Lilies();
        l.prisPrBundt = 37;
        l.antalBlomsterPrBundt = 8;
        l.needWater();

        Lager lager = new Lager();
        lager.antalVarer();
        lager.visVarer();
    }
}
