package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado  convidadoParaRemover = null;
        for(Convidado c: convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Convite 1" , 1234);
        conjuntoConvidados.adicionarConvidado("Convite 2" , 1235);
        conjuntoConvidados.adicionarConvidado("Convite 3" , 1235);
        conjuntoConvidados.adicionarConvidado("Convite 4" , 1236);
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados");

    }
}
