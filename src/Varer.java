import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Varer {

    double stykpris;
    double kgpris;
    double prisPrBundt;
    double antalBlomsterPrBundt;
    Date holdbarhed;
    boolean kanSælges = true;
    boolean skalTilberedes = true;
    boolean freerange = true;

    void smidUd() {
        kanSælges = false;
    }

}
