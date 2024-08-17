package trabalho;

import java.util.Date;

public class Contrato {
    private Date data;
    private double valorPorHora;
    private int horas;

    public double valorTotal(){
        return valorPorHora * horas;
    }


}
