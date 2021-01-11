import java.util.Scanner;


class calculator
{
    public static void main(String [] args)
    {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] parts = s.split ("X\\^");
        int coefficient = Integer.parseInt(parts[0]);
        int exponent = Integer.parseInt(parts[1]);
        String new_coefficient = String.valueOf(coefficient * exponent);
        String new_exponent = String.valueOf(exponent - 1);
        System.out.println(new_coefficient+"X^"+new_exponent);

    }
}