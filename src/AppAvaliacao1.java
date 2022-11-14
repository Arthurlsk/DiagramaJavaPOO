public class AppAvaliacao1 {
    public static void main(String[] args) {

        var obra1= new Obra();

        var eng1= new Engenheiro();
        eng1.setNome("Rick Sanchez");
        eng1.setNumero(1234);
        eng1.setSalario(10000);
        eng1.setFormacao("Engenheiro Civil");

        var const1 = new Construtor();
        const1.setNome("Huguinho");
        const1.setNumero(1111);
        const1.setSalario(3000);
        const1.setTerceirizado(false);

        var const2 = new Construtor();
        const2.setNome("Luizinho");
        const2.setNumero(2222);
        const2.setSalario(2500);
        const2.setTerceirizado(true);

        var eng2= new Engenheiro();
        eng2.setNome("Emmett Brown");
        eng2.setNumero(4321);
        eng2.setSalario(15000f);
        eng2.setFormacao("Engenheiro Civil");

        var const3 = new Construtor();
        const3.setNome("Zezinho");
        const3.setNumero(3333);
        const3.setSalario(3000);
        const3.setTerceirizado(false);

        

        var fase2=new FasesDaObra();
        fase2.setNome("PrimeiroAndar");

        var fase1= new FasesDaObra();
        fase1.setNome("Fundação");

        var item1= new ItemDeConstrucao();
        item1.setQuantidade(500);
        var item2= new ItemDeConstrucao();
        item2.setQuantidade(800);
        var item3= new ItemDeConstrucao();
        item3.setQuantidade(900);
        var item4= new ItemDeConstrucao();
        item4.setQuantidade(1000);

        var mat1= new MaterialDeContrucao();
        mat1.setNome("Viga de madeira");
        mat1.setPreco(20);
        var mat2=new MaterialDeContrucao();
        mat2.setNome("Saco de cimento");
        mat2.setPreco(80);
        var mat3= new MaterialDeContrucao();
        mat3.setNome("Vergalhão de Aço");
        mat3.setPreco(50);

        obra1.getListaFases().add(fase1);
        obra1.getListaFases().add(fase2);

        fase2.setEncarregado(eng1);
        fase2.getListaConstrutores().add(const1);
        fase2.getListaConstrutores().add(const2);

        fase1.setEncarregado(eng2);
        fase1.getListaConstrutores().add(const3);



        item1.setProduto(mat1);
        item2.setProduto(mat2);
        item3.setProduto(mat2);
        item4.setProduto(mat3);

        fase2.getListaItens().add(item1);
        fase2.getListaItens().add(item2);
        fase1.getListaItens().add(item3);
        fase1.getListaItens().add(item4);
        
        var dados=obra1.listarDadosDaObra();
        var cadaFase1=fase1.calcularValorDaFaseDaObra();
        var cadaFase2=fase2.calcularValorDaFaseDaObra();
        var valorTotal=obra1.calcularValorTotalDaObra();


        System.out.println(dados);
        System.out.println("Valor primeira fase: "+ cadaFase1);
        System.out.println("Valor segunda fase: "+cadaFase2);
        System.out.println("Valor Total da Obra: " + valorTotal);
        





        





    }
}
