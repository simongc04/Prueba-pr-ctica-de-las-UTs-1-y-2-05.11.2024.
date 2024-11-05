/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientasthreadsafe;

/**
 *
 * @author simon
 */
public static void main(String[] args) {
        Thread agente1A1 = new Thread(new Actividad("Agente 1 - A1", true, true, false));
        Thread agente2A1 = new Thread(new Actividad("Agente 2 - A1", true, true, false));
        Thread agenteA2 = new Thread(new Actividad("Agente - A2", false, true, true));
        Thread agenteA3 = new Thread(new Actividad("Agente - A3", true, true, true));

        agente1A1.start();
        agente2A1.start();
        agenteA2.start();
        agenteA3.start();
    }

