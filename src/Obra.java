import java.util.ArrayList;

public class Obra {
    private ArrayList<FasesDaObra> listaFases = new ArrayList<>();

    public ArrayList<FasesDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FasesDaObra> listaFases) {
        this.listaFases = listaFases;
    }

    StringBuilder montadorString = new StringBuilder();

    public String listarDadosDaObra() {
        for (var fasesObra : listaFases) {
            montadorString.append("\n Nome: " + fasesObra.getNome());
            montadorString.append("\n Formação: " + fasesObra.getEncarregado().getFormacao());
            montadorString.append("\n Nome(Engenheiro): " + fasesObra.getEncarregado().getNome());
            montadorString.append("\n Número: " + fasesObra.getEncarregado().getNumero());
            montadorString.append("\n Salário: " + fasesObra.getEncarregado().getSalario());
            for (var fasesObra2 : fasesObra.getListaConstrutores()) {
                montadorString.append("\n Nome(Construtor): " + fasesObra2.getNome());
                montadorString.append("\n Número:" + fasesObra2.getNumero());
                montadorString.append("\n Salário:" + fasesObra2.getSalario());
                montadorString.append("\n Terceirizado:" + fasesObra2.isTerceirizado());
                for (var fasesObra3 : fasesObra.getListaItens()) {
                    montadorString.append("\n Quantidade: " + fasesObra3.getQuantidade());
                    montadorString.append("\n Material: " + fasesObra3.getProduto().getNome());
                    montadorString.append("\n Preço: " + fasesObra3.getProduto().getPreco());
                }

            }
        }

        return montadorString.toString();
    }
    public float calcularValorTotalDaObra(){
        float soma=0;
        for(var somaObra : listaFases){
            soma= soma +somaObra.getEncarregado().getSalario();
            for(var SomaObra2 : somaObra.getListaItens()){
                soma= soma + SomaObra2.getQuantidade()*SomaObra2.getProduto().getPreco();
            }
            for(var somaObra3 : somaObra.getListaConstrutores()){
                soma = soma+ somaObra3.getSalario();
            }
        }

        return soma;
    }
}
