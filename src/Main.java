public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float weight = 53.3f;
        float bmi = service.calculate(weight);
        System.out.println(bmi);
    }
}
