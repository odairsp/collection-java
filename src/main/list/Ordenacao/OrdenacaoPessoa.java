package main.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenaPessoa = new OrdenacaoPessoa();

        ordenaPessoa.adcionarPessoa("Jonas",25,1.65);
        ordenaPessoa.adcionarPessoa("Rogério",35,1.85);
        ordenaPessoa.adcionarPessoa("Pedro",21,1.75);
        ordenaPessoa.adcionarPessoa("Odair",46,1.63);
        ordenaPessoa.adcionarPessoa("Simone",28,1.65);

        System.out.println(ordenaPessoa.pessoaList);
        System.out.println(ordenaPessoa.ordenarPorIdade());
        System.out.println(ordenaPessoa.ordenarPorAltura());
    }
}
