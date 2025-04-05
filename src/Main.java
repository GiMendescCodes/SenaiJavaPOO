import Models.Carro;

public class Main {
        public static void main(String[] args) {


            Carro carro1 = new Carro();
            carro1.Modelo = "Toyota Corolla";
            carro1.Ano = 2022;
            carro1.Cor = "Roxo";
            carro1.ExibirInfo();

            System.out.println();
        }
    }
