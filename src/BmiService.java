public class BmiService {
    public double calculate(int weight, int height) {
        double bodyMassIndex = (weight / Math.pow(height, 2)) * 10_000;
        return bodyMassIndex;
    }
}
