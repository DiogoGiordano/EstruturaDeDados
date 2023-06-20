package ED;

public class PilhaLista implements IPilha{

    private NoAl topo;
    private int numElementos;
    public PilhaLista (){
        this.topo = null;
    }

    public boolean push(Aluno info){
        NoAl novo = new NoAl(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProx(topo);
            topo = novo;
        }
        return true;
    }

    public Aluno top() {
        return topo.getInfo();
    }

    public boolean isEmpty() {
        if (topo.getInfo() == null)
            return true;
        else return false;
    }

    public int size() {
        for(NoAl i = topo; i != null; i.getProx())
            numElementos++;
        return numElementos;
    }

    public Aluno pop(){
        Aluno info = null;
        if (!this.isEmpty()){
            info = topo.getInfo();
            topo = topo.getProx();
        }
        return info;
    }

}
