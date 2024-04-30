package br.edu.up;

import br.edu.up.modelos.Livro;

public class Programa {
    
    public static void main(String[] args) throws Exception {
        
        Livro livro1 = new Livro("1598FHK", "Core Java 2", args, "0130819336", 2005);
        Livro livro2 = new Livro("9865PLO", "Java, como programar", args, "0130341517", 2015);
       
        System.out.println("Livro 1");
        System.out.println("Codigo: " + livro1.getCodigo());
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("Autores: " + livro1.getAutores());
        System.out.println("ISBN: " + livro1.getIsbn());
        System.out.println("Ano: " + livro1.getAno());

        System.out.println("\n");

        System.out.println("Livro 2");
        System.out.println("Codigo: " + livro2.getCodigo());
        System.out.println("Titulo: " + livro2.getTitulo());
        System.out.println("Autore: " + livro2.getAutores());
        System.out.println("ISBN: " + livro2.getIsbn());
        System.out.println("Ano: " + livro2.getAno());
        ///
    }
}
