package idea.tad;

public class No {

    private final int info;
    private No prox;
    private No ant;

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

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }
}
