package ED;

public class Main{
    public static void main (String[] args){

        PilhaVet p = new PilhaVet(3);
        p.Push(12);
        p.Push(13);
        p.Push(45);

        p.imprimePilha();

        p.pop();

        p.imprimePilha();

        System.out.println(p.palindromo(119911));
        System.out.println(p.palindromo(229922));
        System.out.println(p.palindromo("arara"));
        System.out.println(p.palindromo("ana"));
        System.out.println(p.palindromo("dylan"));
        System.out.println(p.palindromo(122112));




    }

}