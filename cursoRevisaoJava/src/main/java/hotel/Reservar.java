package hotel;

import javax.swing.*;
import java.util.Arrays;

public class Reservar {
    public static void main(String[] args) {
        Quarto[] quartos = new Quarto[9];
        Estudante[] estudantes = new Estudante[Integer.parseInt(JOptionPane.showInputDialog("Quantos estudantes?"))];

        for (int i = 0; i < estudantes.length ; i++) {
            estudantes[i] = new Estudante(JOptionPane.showInputDialog("Qual seu nome?"), Integer.parseInt(JOptionPane.showInputDialog("Qual quarto deseja reservar?")), JOptionPane.showInputDialog("Qual seu email?"));
            if(quartos[estudantes[i].getQuarto()] == null){
                quartos[estudantes[i].getQuarto()] = new Quarto(estudantes[i]);
                quartos[estudantes[i].getQuarto()].setTaOcupado(true);
            }else{
                JOptionPane.showMessageDialog(null, "Quarto já está ocupado, escolha outro");
                i--;
            }

        }
    }
}
