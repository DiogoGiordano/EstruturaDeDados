package ED;

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

    public void setProximo(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }
}
