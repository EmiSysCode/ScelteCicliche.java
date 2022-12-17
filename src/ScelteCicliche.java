import java.util.Scanner;
public class ScelteCicliche {
    public static void main(String[] args) {
        System.out.println("CREIAMO UN MENU CON SCELTE CICLICHE");
        Scanner scan = new Scanner(System.in);
        int[] esami = null;
        int scelta = 0;
        int maggiore = 0;
        int sommatoria = 0;
        double media = 0;
        do {
            System.out.println("Effettua una selezione:");
            System.out.println("1) Inserisci gli esami");
            System.out.println("2) Stampa i dati inseriti");
            System.out.println("3) Determina il voto più alto");
            System.out.println("4) Calcolo media");
            System.out.println("5) Exit programma");
            scelta = scan.nextInt();
            System.out.println();

            switch (scelta) {
                case 1:
                    // codice che inserisce esami in array
                    // quanti dati vuoi inserire?
                    // create un array con x posizioni
                    // codice che chiede di inserire i dati nelle x posizioni
                    System.out.print("Quanti dati vuoi inserire? ");
                    int dimensione;
                    dimensione = scan.nextInt();
                    esami = new int[dimensione];
                    for (int i = 0; i < dimensione; i++) {
                        System.out.print("Inserisci il voto dell'esame " + (i + 1) + ": ");
                        esami[i] = scan.nextInt();
                    }
                    System.out.println();
                    break;
                case 2:
                    // stampo i dati nell'array con l'indice progressivo
                    System.out.print("Stampa esami: \n");
                    for (int i = 0; i < esami.length; i++) {
                        System.out.print(esami[i] + "\t");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    // determina il voto più alto [da implementare ]
                    for (int i = 0; i < (esami.length); i++) {
                        if (esami[i] > maggiore) {
                            maggiore = esami[i];
                        }
                    }
                    System.out.println("Il nro maggiore è: " + maggiore);
                    System.out.println();
                    break;
                case 4:
                    // calcola media [da implementare]
                    for (int i = 0; i < (esami.length); i++) {
                        sommatoria += esami[i];
                    }
                    media = (sommatoria / esami.length);
                    System.out.println("La media di tutti i numeri inseriti e: " + media);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Ciao ciao arrivederci!");
                    System.exit(0); //termina ed esce dal programma correttamente
                default:
                    System.out.println("Hai inserito scelta errata");
            }
            scelta = 0; // riparte dal 'do'
        }
        while (scelta < 1 || scelta > 5); //true
        //recupero la scelta e la gestisco tramite switch
    }
}