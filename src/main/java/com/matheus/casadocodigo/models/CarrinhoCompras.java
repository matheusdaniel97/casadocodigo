package com.matheus.casadocodigo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

@Component
@Scope(value= WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CarrinhoCompras {
    private Map<CarrinhoItem, Integer> itens = new LinkedHashMap<CarrinhoItem, Integer>();

    public void setItens(Map<CarrinhoItem, Integer> itens) {
        this.itens = itens;
    }

    public void add(CarrinhoItem item){
        itens.put(item, getQuantidade(item) + 1);
    }

    public Integer getQuantidade(CarrinhoItem item) {
        if(!itens.containsKey(item)){
            itens.put(item, 0);
        }
        return itens.get(item);
    }

    public Integer getQuantidade(){
        return itens.values().stream().reduce(0, (proximo, acumulador) -> (proximo + acumulador));
    }

    public Collection<CarrinhoItem> getItens() {
        return itens.keySet();
    }

    public BigDecimal getTotal(CarrinhoItem item) {
        return item.getTotal(getQuantidade(item));
    }

    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;

        for (CarrinhoItem item : itens.keySet()) {
            total = total.add(getTotal(item));
        }

        return total ;
    }


    public void remover(Integer produtoId, TipoPreco tipoPreco) {
        Produto produto = new Produto();
        produto.setId(produtoId);
        itens.remove(new CarrinhoItem(produto,tipoPreco));
    }
}