public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.73;
        double weight = 56;
        double index;
        index = service.calculate(height, weight);
        System.out.println("BMI: " + index);
    }
}
