package idea.tad;

public class No {

    private int info;
    private No prox;

    public No(int info) {
        this.info = info;
        this.prox = null;
    }

    public int getInfo() {
        return info;
    }

    public No getProx() {
        return prox;
    }

    public No setProximo(No n) { this.prox = n;
        return n;
    }

}
