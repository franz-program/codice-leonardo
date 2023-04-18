package ereditarieta;

public class Animale{

    private int numeroZampe;
    private String suono;
    private String nome;

    public Animale(int numeroZampe, String suono, String nome){
        if(numeroZampe <= 0){
            throw new IllegalArgumentException("numero di zampe negativo");
        }

        this.numeroZampe = numeroZampe;
        this.suono = suono;
        this.nome = nome;
    }

    public void faiSuono(){
        System.out.println(nome + " fa: " + suono);
    }


}