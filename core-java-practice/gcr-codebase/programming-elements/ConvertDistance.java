public class ConvertDistance {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double miles = convertKilometersToMiles(kilometers);
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
    }
    public static double convertKilometersToMiles(double kilometers) {
        return kilometers * 1.6;
    }
}