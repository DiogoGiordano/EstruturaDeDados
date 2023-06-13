/*
package ED;

public class LisDupEnc implements Lista{

    private NoAl ini;

    private NoAl fim;


    private int npares;

    public LisDupEnc(){
        this.ini = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        NoAl novo = new NoAl(info);
        if (ini == null) {
            ini = novo;
            fim = novo;
        }
        else {
            novo.setProximo(ini);
            ini.setAnt(novo);
            ini = novo;
        }

    }

    public void insereFim(int info) {
        NoAl novo = new NoAl(info);
        if (ini == null) {
            ini = novo;
            fim = novo;
        }
        else {
            novo.setAnt(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    public NoAl busca(int info) {
        NoAl resultado = null;
        for (NoAl i = ini; i != null ; i = i.getProx()) {
            if (i.getInfo() == info)
                resultado = i;
        }
        return resultado;
    }

    public boolean estaVazia() {
        if (ini == null)
            return true;
        else
            return false;
    }

    public boolean remove(int info) {
        NoAl p = busca(info);
        if (p == null)
            return false;
        if (p.getAnt() == null) {
            ini = p.getProx();
            if (ini != null)
                ini.setAnt(null);
        } else if (p.getProx() == null) {
            p.getAnt().setProximo(null);
            fim = p.getAnt();
        } else {
            p.getAnt().setProximo(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
    }

    public int tamanho() {

        if (ini == null)
            return 0;

        else {
            int tamanho = 0;
            for (NoAl i = ini; i != null; i = i.getProx())
                tamanho++;

            return tamanho;
        }

    }

    public String imprimirListaDE() {
        if (ini == null)
            return "A idea.Lista esta vazia";
        else {
            for (NoAl i = ini; i != null; i = i.getProx()) {
                System.out.print("\n" + i.getInfo());
            }
        }
        return "\nFim da lista";
    }

    public String imprimirListaED() {
        if (ini == null)
            return "A idea.Lista esta vazia";
        else {
            for (NoAl i = fim; i != null; i = i.getAnt()) {
                System.out.print("\n" + i.getInfo());
            }
        }
        return "\nFim da lista";
    }
}


 */