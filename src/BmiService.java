public class BmiService {
    public float calculate (float weight) {
        float height = 1.6f;
        float bmi = weight / (height * height);

        return bmi;
    }
}
