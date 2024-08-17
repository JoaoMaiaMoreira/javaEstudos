package co.Ufc;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public void marcarLuta(Lutador lutador1, Lutador lutador2){
        if(lutador1.getCategoria().equals(lutador2.getCategoria()) && !lutador1.getNome().equals(lutador2.getNome())){
            System.out.println("Luta marcada! " + lutador1.getNome() + " vs " + lutador2.getNome());
            this.aprovada = true;
            this.desafiado = lutador1;
            this.desafiante = lutador2;
        }else{
            System.out.println("Os lutadores não são da mesma categoria");
            this.aprovada = false;
        }
    }

    public void lutar(){
        if(aprovada){
            desafiado.apresentar();
            desafiante.apresentar();
            Random random = new Random();
            int resultado = random.nextInt(3);
                switch (resultado){
                    case 0:
                        desafiante.empatarLuta();
                        desafiado.empatarLuta();
                        System.out.println("Empate");
                        break;
                    case 1:
                        desafiado.ganharLuta();
                        desafiante.perderluta();
                        System.out.println(desafiado.getNome() + " ganhou");
                        break;
                    case 2:
                        desafiante.ganharLuta();
                        desafiado.perderluta();
                        System.out.println(desafiante.getNome() + " ganhou");
                        break;
                }

                //ideia para aprimorar: Fazer um sistema que  lutador vai ter atriputos igual de RPG por exemplo:
                //lutador1, velocidade: 10, atack: 5, defesa: 8. assim posso fazer um jogo no qual se o lutador tiver mais
                //defesa o atack nao causa dano

        }else{
            System.out.println("Luta nao pode ocorrer");
        }
        //ideias do que posso fazer aqui: um sort que iria sortear 1 ou 2 para aleatoriamente definir um vencedor;
        //esperar para ver oq o guanabara quer com essa parte
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        if(aprovada){
            this.aprovada = aprovada;
        }

    }
}
