import java.util.Scanner;
public class Temperatureconverter {

    public static void main(String[] args) {
    Scanner converter = new Scanner(System.in);

    System.out.println("A Simple Temperature Converter");//The title of the program.
    System.out.println("Please enter your first name:");//prompt to enter your name.
    String firstName = converter.nextLine();//taking the username.
    System.out.println("Welcome " + firstName + " to my Temperature Converter!");//Welcoming the user.
    System.out.println("Kindly choose between the two options below:");//prompt for taking the option
    System.out.println("Option 1: Convert from Celsius to Fahrenheit");
    System.out.println("Option 2: Convert from Fahrenheit to Celsius");

    String option = converter.nextLine();// taking the option choice.

    if (option.equalsIgnoreCase("1")) {//block of code to be executed if option 1 is selected.
        System.out.println("Input the desired temperature you want to convert to Fahrenheit:");//prompt to input the temperature in Celsius
        double celsius = converter.nextDouble();//Taking the input
        if (celsius < -273.15) {//inner if statement to check extreme temperatures
            System.out.println("The temperature cannot be lower than -273.15 Celsius.");//prompt if the input exceeds the extreme
        } else {//statement if the input is not exteme
            double fahrenheit = (celsius * 9 / 5) + 32;//conversion calculation
            System.out.println("The temperature in Fahrenheit = " + fahrenheit);//output of the answer
        }
    } else if (option.equalsIgnoreCase("2")) {//block of code to be executed if option 2 is selected.
        System.out.println("Input the desired temperature you want to convert to Celsius:");//prompt to input the temperature in Fahrenheit
        double fahrenheit = converter.nextDouble();//Taking the input
        if (fahrenheit < -459.67) {//inner if statement to check extreme temperatures
            System.out.println("The temperature cannot be lower than -459.67 Fahrenheit.");//prompt if the input exceeds the extreme
        } else {//statement if the input is not exteme
            double celsius = (fahrenheit - 32) * 5 / 9;//conversion calculation
            System.out.println("The temperature in Celsius = " + celsius);//output of the answer
        }
    } else {//code to be executed if neither options is selected
        System.out.println("Invalid option. Please choose '1' or '2'.");//prompt if neither options is selected
    }

    System.out.println("THANK YOU FOR USING THE TEMPERATURE CONVERTER.");//Thanking the user
    converter.close();//closing command
}
//Beatrice Bansah
//22100696

}
