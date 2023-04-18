package idea.tad;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ListSimpEnc implements Lista {

    private No ini;

    public ListSimpEnc() {
        this.ini = null;
    }

    public void insereInicio(Object info) {
        No novo = new No(info);
        if (ini == null)
            ini = novo;
        else {
            novo.setProximo(ini);
            ini = novo;
        }

    }

    public void insereFim(Object info) {
        No novo = new No(info);
        if (ini == null)
            ini = novo;
        else {
            No ultimo = null;
            for (No i = ini; i != null; i = i.getProx())
                ultimo = i;
            ultimo.setProximo(novo);
        }
    }

    public boolean estaVazia() {
        if (ini == null)
            return true;
        else
            return false;
    }

    public boolean remove(Object info) {
        No ant = null, p;
        p = ini;
        while (p != null && p.getInfo() != info) {
            ant = p;
            p = p.getProx();
        }
        if (p == null)
            return false;
        if (ant == null)
            ini = p.getProx();
        else
            ant.setProximo(p.getProx());
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

    @Override
    public String toString() {
        if (ini == null)
            return "A Lista esta vazia";
        else {
            for (No i = ini; i != null; i = i.getProx()) {
                System.out.print("\n" + i.getInfo());
            }
        }
        return "\nFim da lista";
    }
}