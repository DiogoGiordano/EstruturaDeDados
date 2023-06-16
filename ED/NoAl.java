package ED;

public class NoAl {

    private Aluno info;
    private NoAl prox;
    private NoAl ant;

    public NoAl(Aluno info) {
        this.info = info;
        this.prox = null;
    }

    public Aluno getInfo() {
        return info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public NoAl getProx() {
        return prox;
    }

    public void setProx(NoAl prox) {
        this.prox = prox;
    }

    public NoAl getAnt() {
        return ant;
    }

    public void setAnt(NoAl ant) {
        this.ant = ant;
    }
}
