package ED;

public class ABB {
    private Noh raiz;
    private int total;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void add(int element) {
        if (isEmpty()) {
            this.raiz = new Noh(element);
        } else {
            Noh aux = this.raiz;
            while (aux != null) {
                if (element < aux.valor) {
                    if (aux.esq == null) {
                        Noh newNode = new Noh(element);
                        aux.esq = newNode;
                        newNode.pai = aux;
                        return;
                    }
                    aux = aux.esq;
                } else {
                if (aux.dir == null) {
                    Noh newNode = new Noh(element);
                    aux.dir = newNode;
                    newNode.pai = aux;
                    return;
                }
                aux = aux.dir;
            }
            }
        }
    }

    public Noh busca(int valor) {
        Noh aux = raiz;
        while(aux != null) {
            if (valor < aux.valor) {
                aux = aux.esq;
            }
            if (valor > aux.valor) {
                aux = aux.dir;
            }
            if (aux.valor == valor)
                return aux;
        }
        return null;
    }

    public void printa(){
        print(raiz);
    }

    private void print(Noh node) {
        if (node != null) {
            print(node.esq);
            print(node.dir);
            System.out.println(node.valor);
        }
    }
}