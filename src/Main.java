//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashSet;

//ESERCIZIO SVOLTO CON GIUSEPPE FAVARA.
public class Main {
    public static void main(String[] args) {

                // Chiamiamo la funzione per ottenere un HashSet riempito
                HashSet<String> set = SetElements.getFilledHashSet( );

                // Creiamo un oggetto dello stesso tipo inserito nell'HashSet e popoliamolo
                String newElement = "Elemento 3";

                // Verifichiamo se l'elemento è parte del Set e stampiamo il risultato
                Boolean presentElement = set.contains(newElement);
                if(presentElement){
                    System.out.println( newElement + " e' presente nel set." );
                }else{
                    System.out.println( newElement + " non e' presente nel set." );
                }

            }

        }

