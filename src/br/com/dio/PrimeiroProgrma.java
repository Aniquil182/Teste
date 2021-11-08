package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgrma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livros livros = new Livros("O problema dos 3 corpos","360");
        System.out.println(livros);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World!!! " + (a+b));*/
    }
}

class Livros {
    private String nome;
    private String nunPaginas;

    public Livros(String nome, String nunPaginas) {
        this.nome = nome;
        this.nunPaginas = nunPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNunPaginas() {
        return nunPaginas;
    }

    public void setNunPaginas(String nunPaginas) {
        this.nunPaginas = nunPaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", nunPaginas='" + nunPaginas + '\'' +
                '}';
    }
}