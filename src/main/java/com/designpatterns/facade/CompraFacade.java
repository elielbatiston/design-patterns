package com.designpatterns.facade;

public class CompraFacade {

    public static void finalizarCompra(int idProduto, String endereco, String cep, String transportadora, int meioDePagamento) {
        float precoDoProduto = Estoque.retornarPrecoDeUmProdutoPeloID(idProduto);
        Entrega correios = new Entrega();
        correios.endereco = endereco;
        correios.cep = cep;
        correios.transportadora = transportadora;
        float precoDoFrete = correios.calcularFrete();
        float total = precoDoProduto + precoDoFrete;
        if (meioDePagamento == 1) {
            Pagamento.pagarPeloCartao(total);
        } else {
            Pagamento.pagarPeloBoleto(total);
        }
    }
}
