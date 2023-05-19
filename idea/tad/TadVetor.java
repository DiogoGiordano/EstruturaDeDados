package idea.tad;

import java.util.Random;

public class TadVetor {

    private int max1;
    private int max2;
    private int meio;

    private int[] valores;
    private int totalvalores;

    public TadVetor(int tamanho){
        valores = new int[tamanho];
        totalvalores = valores.length;
    }

    public int tamanho() {
        return valores.length;
    }

    public void preencher(){

        Random gerador = new Random();
        for (int i = 0; i < totalvalores; i++)
            valores[i] = gerador.nextInt(1000);

    }

    public void ordenar(){
        for (int i = 0; i < totalvalores; i++)
            for (int j = 0; j < totalvalores-1; j++)
                if (valores[j] > valores[j+1]) {
                    int aux = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = aux;
                }
    }

    public void bubble_sort(){
        for (int i = 0; i < totalvalores; i++)
            for (int j = 0; j < totalvalores-1; j++)
                if (valores[j] > valores[j+1]) {
                    int aux = valores[j];
                    valores[j] = valores[j+1];
                    valores[j+1] = aux;
                }
    }

    public void selection_sort(){
        for (int i = 0; i < totalvalores; i++) {
            int menor = i;
            for (int j = i+1; j < totalvalores; j++)
                if (valores[j] < valores[menor])
                    menor = j;
            int aux = valores[i];
            valores[i] = valores[menor];
            valores[menor] = aux;
        }
    }

    public void insertion_sort() {
        for (int i = 1; i < totalvalores; i++) {
            int chave = valores[i];
            int j = i - 1;
            while (j >= 0 && chave < valores[j]) {
                valores[j + 1] = valores[j];
                j--;
            }
            valores[j + 1] = chave;
        }
    }


    public int maximoRec(int inicio, int fim) {
        if (inicio == fim) {
                return valores[inicio];
            } else
                meio = (inicio + fim) / 2;
            max1 = maximoRec(inicio, meio);
            max2 = maximoRec(meio + 1, fim);
            if (max1 > max2)
                return max1;
            else {
                return max2;
            }
    }

    public int maximoInterativo(int valor){
        for (int i = 0; i < totalvalores; i++) {
            if (valores[i] == valor)
                return i;
        }
        return 0;
    }

    public int pesquisaRec (int valor) {
        int inicio = 0;
        int fim = tamanho();
        int meio;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (valores[meio] == valor)
                return meio + 1;
            else if (valores[meio] > valor)
                fim = meio - 1;
            else
                inicio = meio + 1;
        }
        return 0;
    }

    public String imprimirListaED() {
        if (valores == null)
            return "A Lista esta vazia";
        else {
            for (int valore : valores) {
                System.out.print("\n" + valore);
            }
        }
        return "\nFim da lista";
    }

}
