package past20.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import past20.entities.Employee;;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList();

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salaryText = Double.parseDouble(fields[2]);

                list.add(new Employee(name, email, salaryText));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        List<Employee> salarySuperior = list.stream()
                .filter(x -> x.getSalary() > salary)
                .sorted(Comparator.comparing(Employee::getEmail))
                .collect(Collectors.toList());

        for (Employee result : salarySuperior) {
            System.out.println(result.getName());
            System.out.println(result.getEmail());
            System.out.println(result.getSalary());
        }
        Double soma = list.stream()
                .filter(x -> x.getName().charAt(0) == 'm')
                .map(x -> x.getSalary())
                .reduce(0.0, (x, y) -> x + y);

        System.out.println("O resultado da soma é : " + soma);
        sc.close();
    }
}
