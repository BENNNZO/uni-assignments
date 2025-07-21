package w7;

public class Test {
    public static void main(String[] args) {
        WeatherData day1 = new WeatherData();

        // Next two lines will test the set() methods
        day1.setDailyTemp(75.0);
        day1.setWindSpeed(100);

        // This next line tests the toString() method in WeatherData for Day1
        System.out.println("Day1->" + day1);
        WeatherData day2 = new WeatherData(52.0, 10);
        
        // This next line tests the toString() method in WeatherData for Day2
        System.out.println("Day2->" + day2);
        
        // This next line will test the equals() method in WeatherData with two different objects
        if(day1.equals(day2))
            System.out.println("Day1 is equal to Day2");
        else
            System.out.println("Day1 is NOT equal to Day2");
        
        // This next line will test the equals() method in WeatherData with two equal objects
        WeatherData day3 = new WeatherData(75.0, 100);
        if(day1.equals(day3))
            System.out.println("Day1 is equal to Day3");
        else
            System.out.println("Day1 is NOT equal to Day3");
        
        // The next two lines will test the get() methods of the WeatherData class.
        System.out.println("Day2 Daily Temperature: " + day2.getDailyTemp());
        System.out.println("Day3 Wind Speed: " + day3.getWindSpeed());
    }
}