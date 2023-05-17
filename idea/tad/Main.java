package idea.tad;

import java.util.Date;

public class Main{
    public static void main (String[] args){


        //TadVetor vet = new TadVetor(1001);

        TadVetor vetor = new TadVetor(1000);
        vetor.preencher();
        //vet.preencher();


        final long startTime = System.nanoTime();

        //vet.maximoRec(1,1000);
        vetor.pesquisaRec(1998);


        final long endTime = System.nanoTime();

        System.out.println(endTime - startTime);

    }
}
