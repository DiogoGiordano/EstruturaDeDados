package idea.tad;

public class LisDupEnc implements Lista{

    private No ini;
    private No fim;

    public LisDupEnc(){
        this.ini = null;
        this.fim = null;
    }

    public void insereInicio(int info) {
        No novo = new No(info);
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
        No novo = new No(info);
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

    public boolean estaVazia() {
        if (ini == null)
            return true;
        else
            return false;
    }

    public boolean remove(int info) {
        No p = ini;
        while (ini !=null && p.getInfo() != info)
            ini = ini.getProx();
        if (ini==null)
            return false;
        if (p.equals(ini)){
            ini = p.getProx();
            if (ini != null) ini.setAnt(null);
            else fim = null;
        } else if (p.getProx() == null){
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
            for (No i = ini; i != null; i = i.getProx())
                tamanho++;

            return tamanho;
        }

    }

    public String imprimirListaDE() {
        if (ini == null)
            return "A Lista esta vazia";
        else {
            for (No i = ini; i != null; i = i.getProx()) {
                System.out.print("\n" + i.getInfo());
            }
        }
        return "\nFim da lista";
    }

    public String imprimirListaED() {
        if (ini == null)
            return "A Lista esta vazia";
        else {
            Vetor[] vet = new Vetor[tamanho()];
            for (No i = ini; i != null; i = i.getProx()) {
                Vetor vetor = vet[i.getInfo()];
            }
            for (int i = tamanho(); i <= vet.length; --i){
                System.out.print(vet[i]);
            }
        }
        return "\nFim da lista";
    }
}
