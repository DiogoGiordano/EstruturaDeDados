package idea.tad;

public class No {

    private Object info;
    private No prox;

    public No(Object info) {
        this.info = info;
        this.prox = null;
    }

    public Object getInfo() {
        return info;
    }

    public No getProx() {
        return prox;
    }

    public No setProximo(No n) { this.prox = n;
        return n;
    }

}
