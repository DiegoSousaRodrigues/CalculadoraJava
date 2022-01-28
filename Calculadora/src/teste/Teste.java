package teste;

import javax.swing.JOptionPane;

import operation.Calculadora;

public class Teste {
    static Calculadora calc = new Calculadora();

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Resultado adição: " + calc.adicao());
    }
}
