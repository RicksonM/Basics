package lambdas;

public class CalcularTeste {
    public static void main(String[] args){
        Calcular calc = (a, b) -> {
            return a + b;
        };
     
        System.out.println(calc.executar(5, 7));
    }
}
