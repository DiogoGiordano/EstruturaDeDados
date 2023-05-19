package idea.tad;

public class Main{
    public static void main (String[] args){


        TadVetor td1 = new TadVetor(1000);
        TadVetor td2 = new TadVetor(1000);
        TadVetor td3 = new TadVetor(1000);


        td1.preencher();
        td2.preencher();
        td3.preencher();

        long inicialTime1 = System.nanoTime();
        td1.bubble_sort();
        long finalTime1 = System.nanoTime();

        long inicialTime2 = System.nanoTime();
        td2.selection_sort();
        long finalTime2 = System.nanoTime();

        long inicialTime3 = System.nanoTime();
        td3.insertion_sort();
        long finalTime3 = System.nanoTime();


        System.out.print("\ntempo de execução do bubble sort: " + (finalTime1 - inicialTime1));
        System.out.print("\ntempo de execução do selection sort: " + (finalTime2 - inicialTime2));
        System.out.print("\ntempo de execução do insertion sort: " + (finalTime3 - inicialTime3));


    }
}
