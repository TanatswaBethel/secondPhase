package methodOverloading;

public class NumberOne {

    public int phoneNumber;
    public double salary;
    public String emailAddress;

    int calculate(int phoneNumb, double salary) {

        return phoneNumber;
    }

    int calculate(String emailAddress) {

        return phoneNumber;
    }

    String calculate(double salary) {

        return emailAddress;
    }

    void calculate (int phoneNumber) {

    }
    void calculate (float house) {
        
    }


    public static void main(String[] args) {
        NumberOne one = new NumberOne();

        one.calculate(8904585, 67896.00);
        one.calculate("beemasungure@gmail.com");
        one.calculate(98786.98);


    }




}
