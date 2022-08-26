public class Veiculo {
    private int ano;
    private int peso;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int obterClasse() {
        if (this.ano <= 1970) {
            if (peso < 1200) {
                return 1;
            }
        }
        return 0;
    }
}
