1. How do we get rid of an object?

Set the variable referencing the object to null for the garbage collector or assign a new object to the variable referencing the object.

2. Create a small demo to understand variable scope in java

public class VariableScope {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(creditScore,salary);

        notifyUser(qualified);
    }
    public static double getSalary(){
        System.out.println("Enter you salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter you credit score:");
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditscore, double salary){
        if (creditscore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }else {
            return false;
        }
    }
    public static void notifyUser (boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You've been approved.");
        }else {
            System.out.println("Sorry. You've been rejected");
        }
    }
}

3. What's the constructor called that has parameters?

It is called parameterized constructor.
