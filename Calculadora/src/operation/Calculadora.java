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
        return n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
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

}
