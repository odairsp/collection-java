package main.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){

            for(Livro livro : livrosList){
                if(livro.getAutor().equals(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro livro : livrosList){
                if(livro.getAnoPublicacao()>=anoInicial && livro.getAnoPublicacao()<=anoFinal){
                    livrosPorAno.add(livro);
                }
            }
        }

        return livrosPorAno;
    }public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro livro : livrosList){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1","Autor 1",1975);
        catalogoLivros.adicionarLivro("Livro 2","Autor 2",1800);
        catalogoLivros.adicionarLivro("Livro 3","Autor 3",2000);
        catalogoLivros.adicionarLivro("Livro 4","Autor 1",2021);
        catalogoLivros.adicionarLivro("Livro 1","Autor 2",1945);
        catalogoLivros.adicionarLivro("Livro 6","Autor 3",2011);
        catalogoLivros.adicionarLivro("Livro 7","Autor 1",2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2001,2024));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }

}
