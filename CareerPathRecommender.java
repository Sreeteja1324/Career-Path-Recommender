import java.util.Scanner;

public class CareerPathRecommender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Career Path Recommender!");
        System.out.println("Answer the following questions to find a suitable career path for you.");
        System.out.println("---------------------------------------------------");

        System.out.print("Do you enjoy working with numbers and data? (yes/no): ");
        String dataInterest = scanner.nextLine().trim().toLowerCase();

        System.out.print("Are you more creative or analytical? (creative/analytical): ");
        String mindset = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you prefer working with people or machines? (people/machines): ");
        String preference = scanner.nextLine().trim().toLowerCase();

        System.out.print("Are you interested in technology and programming? (yes/no): ");
        String techInterest = scanner.nextLine().trim().toLowerCase();

        System.out.print("Do you enjoy helping others and solving social issues? (yes/no): ");
        String socialWork = scanner.nextLine().trim().toLowerCase();

        System.out.println("\nBased on your answers, here are some recommended career paths:");

        if (dataInterest.equals("yes") && mindset.equals("analytical") && techInterest.equals("yes")) {
            System.out.println("- Data Scientist");
            System.out.println("- Business Analyst");
        }

        if (techInterest.equals("yes") && preference.equals("machines")) {
            System.out.println("- Software Developer");
            System.out.println("- Cybersecurity Specialist");
            System.out.println("- AI/ML Engineer");
        }

        if (mindset.equals("creative") && preference.equals("people")) {
            System.out.println("- Graphic Designer");
            System.out.println("- Marketing Specialist");
            System.out.println("- Content Creator");
        }

        if (socialWork.equals("yes") && preference.equals("people")) {
            System.out.println("- Psychologist");
            System.out.println("- Social Worker");
            System.out.println("- Teacher");
        }

        if (dataInterest.equals("no") && techInterest.equals("no") && socialWork.equals("no")) {
            System.out.println("- Hospitality Management");
            System.out.println("- Event Planner");
            System.out.println("- Sales Executive");
        }

        if (dataInterest.equals("yes") && techInterest.equals("no") && preference.equals("people")) {
            System.out.println("- Economist");
            System.out.println("- Financial Advisor");
        }

        System.out.println("\nRemember, your career is your journey. Keep exploring and learning!");
        scanner.close();
    }
}
