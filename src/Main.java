public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightMetr = 1.87;
        double bmid = service.calculate (weightKg,heightMetr);
        int bmi = (int) bmid;

        System.out.println(bmi);
    }
}