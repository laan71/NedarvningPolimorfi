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
        a.stykpris = 2;
        a.holdbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holdbarhed = new Date(1608768000);
        p.freeze();

        Chicken c = new Chicken();
        c.freerange = true;
        c.kgpris = 65;
        c.skalTilberedes = true;
        c.holdbarhed = new Date(1608768000);
        c.freeze();

        Beef b = new Beef();
        b.freerange = true;
        b.kgpris = 125;
        b.skalTilberedes = true;
        b.holdbarhed = new Date(1608768000);
        c.freeze();

        Roses r = new Roses();
        r.prisPrBundt = 45;
        r.antalBlomsterPrBundt = 12;
        r.needWater();

        Lilies l = new Lilies();
        l.prisPrBundt = 37;
        l.antalBlomsterPrBundt = 8;
        l.needWater();





    }

}
