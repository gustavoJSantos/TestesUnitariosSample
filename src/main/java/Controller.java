public class Controller extends Funcoes{
    private double resultado;
    private String retorno;

    public Controller (){ }

    public void realizarConta(char func, double num1, double num2){
        switch (func){
            case '+':
                //resultado = soma(num1, num2);
                resultado = 20;
                retorno = "A soma é "+resultado;
                break;

            case '-':
                //resultado = subtracao(num1, num2);
                resultado = 0;
                retorno = "A subtracao é "+resultado;
                break;

            case '*':
                //resultado = multiplicacao(num1, num2);
                resultado = 100;
                retorno = "A multiplicação é "+resultado;
                break;

            case '/':
                resultado = divisao(num1, num2);
                retorno = "A divisão é "+resultado;
                break;

            default:
                retorno = "Caractere inválido";
                break;
        }

        System.out.println(retorno);
    }

    public String getRetorno() {
        return retorno;
    }
}
