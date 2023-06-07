package ED;

public class PilhaVet implements IPilha {

    private Object[] pilha;
    private int numElem;
    public PilhaVet (int tamanhoVetor){
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;
    }

    public boolean Push(Object info){
        if (numElem == pilha.length){
            System.out.println("pilha estourou");
            return false;
        }
        pilha[this.numElem] = info;
        numElem++;
        return true;
    }
    public Object top() {
        return pilha[numElem - 1];
    }

    public boolean isEmpty() {
        if (top() == null)
            return true;
        else
            return false;
    }

    public int size() {
        return numElem;
    }

    public Object pop(){
        Object o = null;
        if(isEmpty()){
            System.out.println("Pilha vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    public boolean palindromo(Object info) {
        String Wbackwards = "";
        for(int i = info.toString().length() - 1; i >= 0; i--)
            Wbackwards += info.toString().charAt(i);

        if(info.toString().equals(Wbackwards))
            return true;
        else
            return false;
    }

    public void imprimePilha() {
        if (!isEmpty())
            for (int i = numElem - 1; i >= 0; i--)
                System.out.println(pilha[i]);
        else
            System.out.println("Pilha vazia");
    }
}
