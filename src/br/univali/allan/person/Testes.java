package br.univali.allan.person;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class Testes {

    public void testeProfessor(){
        Professor masterSplinter = new Professor("Mestre Splinter", LocalDate.of(1984, Month.MAY, 14), 999,
                LocalDate.of(1995, Month.FEBRUARY, 27), 48, BigDecimal.valueOf(14.00),AcademicDegree.MASTER);
        Professor doctorStrange = new Professor("Doutor Estranho", LocalDate.of(1963, Month.JULY, 25), 998,
                LocalDate.of(1995, Month.FEBRUARY, 27), 48, BigDecimal.valueOf(14.00),AcademicDegree.DOCTORATE);


        System.out.println("SPLINTER: ");
        System.out.println(masterSplinter.calculateRegularWeekSalary());
        System.out.println(masterSplinter.calculateWeekPayment(0));
        System.out.println(masterSplinter.getHourlyRate());
        System.out.println("=================");
        System.out.println("Doctor Strange: ");
        System.out.println(doctorStrange.calculateRegularWeekSalary());
        System.out.println(doctorStrange.calculateWeekPayment(0));
        System.out.println(doctorStrange.getHourlyRate());
    }

    public void testeEmployee(){
        Employee employee = new Employee("Legolas Verdefolha", LocalDate.of(1753, Month.JANUARY, 1),1,
                LocalDate.of(2001, Month.SEPTEMBER, 3), 48, BigDecimal.valueOf(11.30));
        System.out.println(employee.calculateRegularWeekSalary());
        System.out.println(employee.calculateWeekPayment(5));
        System.out.println("=======");
        System.out.println(employee.calculateYearsOfService());
        //employee.setTerminationDate(LocalDate.of(2004, Month.JUNE, 29));
        //System.out.println(employee.calculateYearsOfService());
        //String name, LocalDate dateOfBirth, int id, LocalDate hireDate, int hoursPerWorkWeek, BigDecimal hourlyRate)

    }

    public void testeStudent(){
        Student student = new Student("Allan Mainardes",LocalDate.of(1997, Month.SEPTEMBER, 25)
                , 7, LocalDate.of(2016, Month.JUNE, 11));

        System.out.println(student.calculateAge());

        student.setDropDate(LocalDate.of(2019, Month.JUNE, 5));
        student.isEnrolled();
    }

    public static void main(String args[]){

        Testes testes = new Testes();
        //testes.testeStudent();
        //testes.testeEmployee();
        testes.testeProfessor();


    }
}
