package co.banco;

public class Conta {
    public int numeroConta;
    private String tipoDeConta;

    private String dono;

    private String nome;

    public float saldo;

    private boolean status;

    public void estadoAtual(){
        System.out.println("Conta: " + this.numeroConta );
        System.out.println("Tipo de Conta: " + this.tipoDeConta);
        System.out.println("Dono: " + this.nome);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada, ainda tem dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Tu ta devendo! Não pode fechar!");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }

    public void pagarMensal(){
        float pagamento = 0;
        if (tipoDeConta.equals("c")) {
            pagamento = 12;
        }else if(tipoDeConta.equals("p")){
            pagamento = 20;
        }

        if(getStatus()){
            if (saldo > pagamento){
                saldo = saldo - pagamento;
            }else{
                System.out.println("Nao tem saldo nem para a cobranca mensal");
            }
        }else{
            System.out.println("nao pode pagar");
        }
    }

    public void sacar(int valor){
        if(getStatus() && getSaldo() > valor){
            setSaldo(getSaldo() - valor);
        }else{
            System.out.println("Não tem dinheiro para realizar saque no valor: " + valor);
        }
    }

    public void adicionar(int valor){
        if(status){
          setSaldo(getSaldo() + valor);
        }else{
            System.out.println("Impossivel depositar");
        }

    }


    public Conta(){
        this.saldo = 0;
        this.status = false;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void abrirConta(String tipoDeConta){
        setTipoDeConta(tipoDeConta);
        setStatus(true);
        if(tipoDeConta.equals("c")){
            setSaldo(50);
        }else if(tipoDeConta.equals(("cp"))){
            setSaldo(150);
        }
        System.out.println("----------------------------");
        System.out.println("--Conta aberta com sucesso--");
        System.out.println("----------------------------");
    }

    public void fechar(){
        setStatus(false);
        if(saldo == 0){
            System.out.println("Conta fechada");
        }else if(saldo < 0 || saldo > 0){
            System.out.println("Pague suas dividas");
        }
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setStatus(boolean status){
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo(){
        return saldo;
    }

}

