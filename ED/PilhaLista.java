package ED;

public class PilhaLista implements IPilha{

    private No topo;
    private int numElementos;
    public PilhaLista (){
        this.topo = null;
    }

    public boolean push(Object info){
        No novo = new No(info);
        if (this.isEmpty())
            topo = novo;
        else {
            novo.setProx(topo);
            topo = novo;
        }
        return true;
    }

    public Object top() {
        return topo.getInfo();
    }

    public boolean isEmpty() {
        if (topo.getInfo() == null)
            return true;
        else return false;
    }

    public int size() {
        for(No i = topo; i != null; i.getProx())
            numElementos++;
        return numElementos;
    }

    public Object pop(){
        Object info = null;
        if (!this.isEmpty()){
            info = topo.getInfo();
            topo = topo.getProx();
        }
        return info;
    }

}
