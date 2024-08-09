package main.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String  nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerPorConvite(int codigoConvite) throws RuntimeException {
        Convidado convidadoParaRemover = null;
        if (!convidadoSet.isEmpty()){
            for(Convidado convidado : convidadoSet){
                if(convidado.getCodigoConvite() == codigoConvite){
                    convidadoParaRemover = convidado;
                    break;
                }else {
                    throw new RuntimeException("Código inexixtente!");
                }
            }
            convidadoSet.remove(convidadoParaRemover);
        }
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.exibirConvidados();
        convidados.adicionarConvidado("Convidado 1", 1001);
        convidados.adicionarConvidado("Convidado 2", 1002);
        convidados.adicionarConvidado("Convidado 3", 1003);
        convidados.adicionarConvidado("Convidado 3", 1004);
        convidados.exibirConvidados();
    }

}
