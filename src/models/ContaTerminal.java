package models;

public class ContaTerminal {
        private String usuario;
        private String agencia;
        private String nome;
        private double saldo;

        public ContaTerminal(String usuario, String agencia, String nome, double saldo) {
            this.usuario = usuario;
            this.agencia = agencia;
            this.nome = nome;
            this.saldo = saldo;
        }

        public String getUsuario() {
            return usuario;
        }

        public String getAgencia() {
            return agencia;
        }

        public String getNome() {
            return nome;
        }

        public double getSaldo() {
            return saldo;
        }

        public void exibirDetalhes() {
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agencia + ", conta " + usuario + " e seu saldo " + saldo + " já está disponível para saque.");
        }
    }
