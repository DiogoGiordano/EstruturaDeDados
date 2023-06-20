package ED;

public class FilaVet implements IFila{

    private int nElemFila;
    private int inicio;
    private Object[] vetFila;
    public FilaVet(){
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[1];
    }

    public boolean add(Object info){
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotou");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    public Object remove() {
        if (isEmpty()){
            System.out.println("Fila estah vazia");
            return false;
        }
        inicio = (this.inicio + 1) % this.vetFila.length;
        nElemFila--;
        return vetFila[inicio];
    }

    public boolean isEmpty(){
        if(nElemFila == 0)
            return true;
        else{
                    return false;
        }
    }

    public int size() {
        return nElemFila;
    }

    public void printList(){
        for (int i = nElemFila - 1; i >= 0; i--){
            System.out.print(vetFila[i]);
        }
    }

}
