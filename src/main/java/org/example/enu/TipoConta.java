package org.example;

public enum TipoConta {

    POUPANCA("Conta Poupança") {
        @Override
        public String getDescricao() {
            return "Conta de Poupança";
        }
    },
    SALARIO("Conta Salário") {
        @Override
        public String getDescricao() {
            return "Conta Salário";
        }
    },
    CORRENTE("Conta Corrente") {
        @Override
        public String getDescricao() {
            return "Conta Corrente";
        }
    },
    CONJUNTA("Conta Conjunta") {
        @Override
        public String getDescricao() {
            return "Conta Conjunta";
        }
    };

    private String descricao;

    TipoConta(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getDescricao();
    }
