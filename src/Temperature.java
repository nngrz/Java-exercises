public class Temperature{
    static double convertToFahrenheit(double celsius){
        double fahrenheit = celsius * 9/5 + 32;
        return fahrenheit;
    }
    public static void main (String[] args){
        double celsius = 100;
        System.out.println(celsius + "°C in Fahrenheit is " + convertToFahrenheit(celsius) + "°F.");
    }
}
