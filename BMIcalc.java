import java.util.Scanner;

public class BMIcalc {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your weight in kilograms:");
            double weight = scanner.nextDouble();

            System.out.println("Now, enter your height in meters:");
            double height = scanner.nextDouble();

            double bmi = calculateBMI(weight, height);
            String bmiCategory = determineBMICategory(bmi);
            String healthAdvice = provideHealthAdvice(bmiCategory);

            System.out.println("Your BMI is: " + bmi);
            System.out.println("BMI Category: " + bmiCategory);
            System.out.println("Health Advice: " + healthAdvice);
        }
    }

    private static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    private static String determineBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Slight overweight";
        } else {
            return "Overweight";
        }
    }

    private static String provideHealthAdvice(String bmiCategory) {
        switch (bmiCategory) {
            case "Underweight":
                return "It's important to maintain a balanced diet and consult with a healthcare professional.";
            case "Normal weight":
                return "Keep up the good work! Continue with a healthy lifestyle and regular exercise.";
            case "Slight overweight":
                return "Consider adopting a balanced diet and increasing physical activity for overall health.";
            case "Overweight":
                return "It's advisable to focus on a well-balanced diet and regular exercise. Consult with a healthcare professional for personalized advice.";
            default:
                return "No specific advice at this time.";
        }
    }
}