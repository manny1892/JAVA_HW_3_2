public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 83;
        int height = 195;
        double bodyMassIndex = service.calculate(weight, height);
        String result = String.format("%.2f", bodyMassIndex);
        System.out.println("Ваш ИМТ = " + result);

    }
}
