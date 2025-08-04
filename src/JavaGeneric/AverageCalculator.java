package JavaGeneric;

public class AverageCalculator <T extends Number> {
    T [] values;
    public AverageCalculator(T [] values) {
        this.values = values;
    }
    public double calculatteAvarage(){
        double sum = 0.0;
        for (T value : values) {
            sum += value.doubleValue();
        }
        return sum / values.length;
    }
}
