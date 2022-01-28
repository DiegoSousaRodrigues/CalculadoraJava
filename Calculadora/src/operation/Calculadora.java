package operation;

import javax.swing.JOptionPane;

public class Calculadora {
    private int n1;
    private int n2;
    private int op;
    private int result;

    public int getN1() {
        return n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
    }

    public int getN2() {
        return n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
    }

    public int getOp() {
        return op;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public int adicao() {
        return result = getN1() + getN2();
    }

    public int sub() {
        return result = getN1() - getN2();
    }

    public int mult() {
        return result = getN1() * getN2();
    }

    public int div() {
        n1 = getN1();
        do {
            n2 = getN2();
        } while (n2 == 0);
        return result = n1 / n2;
    }

    public int opcao() {
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite sua opção: \n1 - para adição\n2 - para subtração\n3 - para multiplicação\n4 - para divisão"));

        } while (op < 1 || op > 4);
        
        if (op == 1) {
            return adicao();
        }
        if (op == 2) {
            return sub();
        }
        if (op == 3) {
            return mult();
        }
        if (op == 4) {
            return div();
        }
        return 0;
    }
}
