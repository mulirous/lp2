package listaSala.encapsulamento;
import java.util.Scanner;

public class AluguelCarros {
    
}

class Carro {
  public String nome;
  public String marca;
  public int ano;
  public double preco;
  private double quilometragem;
  private boolean disponivel = true;

  public Carro(String nome, String marca, int ano, double preco, double quilometragem) {
    this.nome = nome;
    this.marca = marca;
    this.ano = ano;
    this. preco = preco;
    this.quilometragem = quilometragem;
  }

  public void showInfos() {
    System.out.printf("Carro - %s\n Marca - %s\n Ano - $%d\n Quilometragem -%s\n Preço Diária - %d", this.nome, this.marca, this.ano, this.quilometragem, this.preco );
  }
}

class Reserva {

} 

class Cliente {

}