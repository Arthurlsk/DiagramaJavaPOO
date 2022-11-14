import java.util.ArrayList;

public class FasesDaObra {
    private String nome;
    private Engenheiro encarregado;
    private ArrayList<ItemDeConstrucao>listaItens= new ArrayList<>();
    private ArrayList<Construtor>listaConstrutores= new ArrayList<>();
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Engenheiro getEncarregado() {
        return encarregado;
    }
    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }
    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }
    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }
    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }
    
    public float calcularValorDaFaseDaObra(){
        float soma =0f;
        soma= getEncarregado().getSalario();
         
        for(var construtores : getListaConstrutores()){
            soma = soma+construtores.getSalario();
        }
        
        for(var itens : getListaItens()){
            soma=  soma + itens.getQuantidade()*itens.getProduto().getPreco();
        }
        
        return soma;
    }
    
    
    
}
