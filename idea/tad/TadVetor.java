package idea.tad;

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
        for (int i = 0; i < totalvalores; i++)
            valores[i] = i + i;

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


}
