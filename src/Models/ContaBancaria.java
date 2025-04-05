package Models;
//Encapsulamento
public class ContaBancaria {
    double Saldo;
    void Depositar(double valor){
        if (valor > 0) Saldo+=valor;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}
