package idea.tad;

public class Main{
    public static void main (String[] args){

        TadVetor tdrec = new TadVetor(1000);
        TadVetor tdint = new TadVetor(1000);

        long inicialTime1 = System.nanoTime();

        tdrec.maximoRec(1,999);

        long finalTime1 = System.nanoTime();

        System.out.print("\nTempo de execução do método recursivo: " + (finalTime1 - inicialTime1));




        long inicialTime2 = System.nanoTime();

        tdint.maximoInterativo(2000);

        long finalTime2 = System.nanoTime();


        System.out.print("\nTempo de execução do método iterativo: " + (finalTime2 - inicialTime2));

    }
}
