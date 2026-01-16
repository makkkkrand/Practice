package com.practice.stream;

import com.practice.dto.Employee;
import org.apache.tomcat.util.buf.StringUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPractice {

    static List<Employee> empList = new ArrayList<>();

    public static List<Employee> getEmpList() {
        empList.add(new Employee("1", "Mukund", "Male", "Developemnt", 5000000.00));
        empList.add(new Employee("2", "Anshu", "Female", "HR", 500000.00));
        empList.add(new Employee("3", "Ashok", "Male", "Admin", 1000000.00));
        empList.add(new Employee("4", "Rahul", "Male", "Procurement", 2000000.00));
        empList.add(new Employee("5", "Shital", "Female", "Developemnt", 4000000.00));
        return empList;
    }

    public static void main(String[] args) {
        System.out.println(getEmployeeGroup(getEmpList()));


        // How do you retrieve the 5th element from a List in Java 8?
        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
        System.out.println(list.stream().skip(4).findFirst().get());//note skip(4)

        // Given a String, how do you find the character with the second-highest
        // frequency using Java 8 Streams?
        String s = "abbcccd";
        System.out.println("second-highest frequency:" + s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).skip(1).findFirst().orElseThrow().getKey());

        // Given s = "abcd", how do you generate the pattern abbcccdddd using Java 8
        // Streams?
        String string = "abcd";
        System.out.println(IntStream.range(0, string.length())
                .mapToObj(i -> String.valueOf(string.charAt(i)).repeat(i + 1)).collect(Collectors.joining()));

        // How do you sort a list of Employee objects by both name and salary using Java
        // 8?
        System.out.println("list of Employee objects by both name and salary" + getEmpList().stream().sorted(
                        Comparator.comparing(Employee::getName).thenComparing(Comparator.comparing(Employee::getSalary)))
                .toList());

        // How to group by department and top salaried employee in each department ordered by name descending order and department by ascending order using Java 8 Streams?
        getEmpList().stream().collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                Optional::get)))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Employee>comparingByKey()
                        .thenComparing(e -> e.getValue().getName(), Comparator.reverseOrder()))
                .forEach(e -> System.out.println("Department: " + e.getKey() + ", Employee: " + e.getValue().getName()));

        //Grouping employees by department and then by gender, and calculating average salary.
        Map<String, Map<String, Double>> avgSalaryByDeptAndGender = getEmpList().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getGender,
                                Collectors.averagingDouble(Employee::getSalary))));
        System.out.println("Average Salary by Department and Gender: " + avgSalaryByDeptAndGender);

        // Given a list of integers, how do you separate the elements into two lists —
        // one containing duplicates and the other containing unique elements using Java
        // 8?
        List<Integer> listI = Arrays.asList(1, 2, 3, 1, 2, 4, 5);
        Map<Boolean, List<Map.Entry<Integer, Long>>> collectn = listI.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .collect(Collectors.partitioningBy(e -> e.getValue() > 1));
        System.out.println("unique:"
                + StringUtils.join(collectn.get(false).stream().map(e -> String.valueOf(e.getKey())).toList(), ','));
        System.out.println("duplicate:"
                + StringUtils.join(collectn.get(true).stream().map(e -> String.valueOf(e.getKey())).toList(), ','));

        // How do you find common elements between two sorted integer lists using Java 8
        // Streams?
        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(2, 4, 6);

        System.out.println(a.parallelStream().filter(b::contains).toList());

        // From a list of Strings, how do you remove the words that contain any numeric
        // digits using Java 8?
        List<String> list2 = Arrays.asList("abc", "ab1c", "hello", "h3i");
        System.out.println(list2.stream().filter(str -> !str.matches(".*\\d.*")).toList());

        // Given a String, how do you find the character with the highest frequency?
        Map<Character, Long> resMap = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<Character, Long>> first = resMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst();
        if (first.isPresent()) {
            System.out.println(first.get().getKey());
        } else {
            System.out.println("no value");
        }

        System.out.println("Floyd's triangle :-");
        int n = 3, num = 1;
        for (int c = 1; c <= n; c++) {
            for (int d = 1; d <= c; d++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        String str = "automation";
        System.out.println(str.chars().mapToObj(c -> String.valueOf((char) c)).distinct().collect(Collectors.joining("")));

        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
        String vowels = "AEIOUaeiou";
        System.out.println(str.chars().mapToObj(c -> String.valueOf((char) c)).filter(c -> vowels.contains(c)).count());
    }

    // Group employees by gender and department
    public static Map<String, Map<String, List<Employee>>> getEmployeeGroup(List<Employee> employeeList) {
        //Group by gender
        Map<String, List<Employee>> collect = employeeList.parallelStream()
                .collect(Collectors.groupingBy(Employee::getGender));

        //Group by gender and department
        Map<String, Map<String, List<Employee>>> map = employeeList.parallelStream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(Employee::getDepartment)));

        //Group by gender and department and then sort values by name in desc id in asc
        Map<String, Map<String, List<Employee>>> map2 = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed()
                        .thenComparing(Employee::getId))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(Employee::getDepartment)));

        return map2;
    }
}
