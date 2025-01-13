package lambdas;

public class Somar implements Calcular{
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}
