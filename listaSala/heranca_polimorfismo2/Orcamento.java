package heranca_polimorfismo2;

public class Orcamento {
    public static void main(String[] args) {
        ItemOrcamento[] itens = new ItemOrcamento[2];

        itens[0] = new ItemOrcamento("Viga de concreto 20cm", 170.00f);
        itens[1] = new ItemOrcamento("Telhado de madeira 12m", 1880.00f);

        ItemOrcamentoComplexo itemC = new ItemOrcamentoComplexo("Itens de orçamento", 0, itens);

        System.out.println("O valor total dos itens de orçamento é " + itemC.getValor() + "R$, que são " + itemC.getHistoco());

        ItemOrcamento itemNormal = itemC.encontraItem("Viga de concreto 20cm");

        System.out.println("O item " + itemNormal.getHistoco() + " foi encontrado na lista de items");
    }
}

class ItemOrcamento {
    private String historico;
    private float valor;

    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistoco() {
        return this.historico;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}

class ItemOrcamentoComplexo extends ItemOrcamento {
    ItemOrcamento[] itens;

    public ItemOrcamentoComplexo (String historico, float valor, ItemOrcamento[] itens) {
        super(historico, valor);
        this.itens = itens;
    }

    @Override
    public float getValor() {
        float x = 0;
        for (ItemOrcamento i : itens) {
            x += i.getValor();
        }

        setValor(x);

        return super.getValor();
    }

    public ItemOrcamento encontraItem (String historico){
        for (ItemOrcamento i : itens) {
            if (i.getHistoco().equalsIgnoreCase(historico)) {
                return i;
            }
        }

        return null;
    };
}