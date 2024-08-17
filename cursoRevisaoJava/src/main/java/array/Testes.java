package array;

import javax.swing.*;

public class Testes {
    public static void main(String[] args) {
        double[] vet = new double[3];
        double soma = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digita ai"));
            soma += vet[i];
        }

        JOptionPane.showMessageDialog(null, "a media é " + soma/3);

    }
}
