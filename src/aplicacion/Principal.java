package aplicacion;
import dominio.*;
import java.io.*;
import java.util.concurrent.*;
public class Principal {
    public static void main(String[] args){
        Tablero tablero = new Tablero();
        try {

            System.out.println("SIMULACIÓN CON TABLERO LEÍDO ");
            tablero.leerEstadoActual();
            System.out.println(tablero);
            for (int i = 0; i <= 5; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
                System.out.println("Siguiente tablero");
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e) {
            System.out.println(e);
        }catch (InterruptedException e) {
            System.out.println(e);
        }try{
            System.out.println("SIMULACIÓN CON TABLERO GENERADO MEDIANTE MONTECARLO");
            tablero.generarEstadoActualPorMontecarlo();
            System.out.println(tablero);
            for(int i = 0; i <= 15; i++)
            {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }
        }catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }
}
