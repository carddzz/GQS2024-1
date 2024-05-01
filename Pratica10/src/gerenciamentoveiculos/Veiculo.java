package gerenciamentoveiculos;

//Definição da classe Veiculo
public class Veiculo {
 // Atributos privados da classe Veiculo
 private String numeroChassi;
 private String placa;
 private String marca;
 private String modelo;
 private int ano;

 // Construtor da classe Veiculo
 public Veiculo(String numeroChassi, String placa, String marca, String modelo, int ano) {
     this.numeroChassi = numeroChassi; // Inicializa o número do chassi
     this.placa = placa; // Inicializa a placa
     this.marca = marca; // Inicializa a marca
     this.modelo = modelo; // Inicializa o modelo
     this.ano = ano; // Inicializa o ano
 }

 // Método getter para o número do chassi
 public String getNumeroChassi() {
     return numeroChassi;
 }

 // Método getter para a placa
 public String getPlaca() {
     return placa;
 }

 // Método toString que retorna uma representação textual do objeto Veiculo
 @Override
 public String toString() {
     return "Chassi: " + numeroChassi + ", Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
 }
}
