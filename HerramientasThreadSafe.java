package herramientasthreadsafe;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author simon
 */
public class HerramientasThreadSafe {
    public static boolean hayTaladro = true;
    public static boolean hayDestornillador = true;
    public static boolean hayAlicates = true;

    public synchronized static boolean tomarTaladro() {
        if (hayTaladro) {
            hayTaladro = false;
            return true;
        }
        return false;
    }

    public synchronized static boolean tomarDestornillador() {
        if (hayDestornillador) {
            hayDestornillador = false;
            return true;
        }
        return false;
    }

    public synchronized static boolean tomarAlicates() {
        if (hayAlicates) {
            hayAlicates = false;
            return true;
        }
        return false;
    }

    public synchronized static void dejarTaladro() {
        hayTaladro = true;
        HerramientasThreadSafe.class.notifyAll();
    }

    public synchronized static void dejarDestornillador() {
        hayDestornillador = true;
        HerramientasThreadSafe.class.notifyAll();
    }

    public synchronized static void dejarAlicates() {
        hayAlicates = true;
        HerramientasThreadSafe.class.notifyAll();
    }
}

