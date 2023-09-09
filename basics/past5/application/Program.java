package past5.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import past5.entities.Employee;
import past5.entities.OutSourcedEmployee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int number = sc.nextInt();
        sc.nextLine();

        List<Employee> vect = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < number; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.println("Outsourced");
            char response = sc.next().charAt(0);
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Hours:");
            int hours = sc.nextInt();
            sc.nextLine();
            System.out.println("Value per hour:");
            double value = sc.nextDouble();
            sc.nextLine();
            Employee emp = (response == 'y' ? new OutSourcedEmployee(name, hours, value, value)
                    : new Employee(name, hours, value));
            vect.add(emp);
        }

        sb.append("Payment\n");
        for (Employee c : vect) {
            sb.append(c.getName());
            sb.append(" -");
            sb.append("$ " + c.payment() + "\n");
        }
        String finalString = sb.toString();

        // Imprimir a string resultante
        System.out.println(finalString);
        sc.close();
    }
}
