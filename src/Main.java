public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float weight = 53.3f;
        float bmi = service.calculate(weight);
        
        float height = 1f;
        if (height > 0) {
            System.out.println("Индекс массы тела " + bmi);
        }
    }
}
