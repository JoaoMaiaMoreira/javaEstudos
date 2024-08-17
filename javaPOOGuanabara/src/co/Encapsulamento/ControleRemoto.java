package co.Encapsulamento;

public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----Menu-----");
        System.out.println("tá ligado? " + this.isLigado());
        System.out.println("tá tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());

        for (int i = 0; i < getVolume() ; i++) {
            System.out.print("|");
        }
        System.out.println(" ");
        System.out.println(this.isTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado");

    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            setVolume(getVolume() + 5);
        }else{
            System.out.println("a tv esta desligada");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            setVolume(getVolume() - 5);
        }else{
            System.out.println("a tv esta desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado()){
            this.setTocando(false);
        }
    }
}
