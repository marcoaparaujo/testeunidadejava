public class Imc {

    private float peso;
    private float altura;
    private String sexo;

    public Imc(float peso, float altura, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String calcularImc() {
        float imc;
        imc = this.peso / (this.altura * this.altura);
        if (this.sexo.equals("F")) {
            if (imc < 19.1f) {
                return "abaixo do peso";
            }
            else {
                if (imc < 25.8f) {
                    return "no peso normal";
                }
                else {
                    if (imc < 27.3f) {
                        return "marginalmente acima do peso";
                    }
                    else {
                        if (imc < 32.3f) {
                            return "acima do peso ideal";
                        }
                        else {
                            return "obeso";
                        }
                    }
                }
            }
        }
        else {
            return null;
        }
    }

}