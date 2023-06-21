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

    public void print(){
        print(raiz);
    }

    private void print(Noh node) {
        if (node != null) {
            print(node.esq);
            print(node.dir);
            System.out.println(node.valor);
        }
    }


    public void emOrdem(){
        emOrdem(raiz);
    }
    private void emOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.esq);
            System.out.println(node.valor);
            emOrdem(node.dir);
        }
    }

    public void posOrdem(){
        posOrdem(raiz);
    }
    private void posOrdem(Noh node) {
        if (node != null) {
            emOrdem(node.esq);
            emOrdem(node.dir);
            System.out.println(node.valor);
        }
    }

    public void preOrdem(){
        preOrdem(raiz);
    }
    private void preOrdem(Noh node) {
        if (node != null) {
            System.out.println(node.valor);
            emOrdem(node.esq);
            emOrdem(node.dir);
        }
    }

    public Noh buscaIter(int element) {
        Noh aux = this.raiz;
        while (aux != null) {
            if (aux.valor == element) return aux;
            if (element < aux.valor) aux = aux.esq;
            if (element > aux.valor) aux = aux.dir;
        }
        return null;
    }

    public Noh buscaRec(int element) {
        return buscaRec(this.raiz, element);
    }
    private Noh buscaRec(Noh node, int element) {
        if (node == null) return null;
        if (element == node.valor) return node;
        if (element < node.valor)
            return buscaRec(node.esq, element);
        else
            return buscaRec(node.dir, element);
    }


    public void remove(int valor) {
        raiz = busca(valor);
        //Caso 1
        if (raiz.valor == raiz.valor) {
            raiz.valor = 0;
            return;
        }
        //Caso 1
        if(raiz.esq == null && raiz.dir == null) {
            raiz.valor = 0;
            return;
        }
        //caso 2
        if(raiz.esq != null || raiz.dir != null) {
            if (raiz.esq != null) {
                raiz.esq.pai = raiz.pai;
            }
            if(raiz.dir != null) {
                raiz.dir.pai = raiz.pai;
            }
        }
        //caso 3
        if(raiz.esq != null && raiz.dir != null) {
            raiz.dir = raiz;
            remove(raiz.valor);
        }
    }

}