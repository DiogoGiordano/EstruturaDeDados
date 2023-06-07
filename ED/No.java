package ED;

public class No {

    private Object info;
    private No prox;
    private No ant;

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

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }
}
