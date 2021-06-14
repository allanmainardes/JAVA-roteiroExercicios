package br.univali.allan.person;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import static java.util.Objects.isNull;

class Employee extends Person{
    private int id;
    private LocalDate hireDate;
    private LocalDate terminationDate;
    private int hoursPerWorkWeek;
    private BigDecimal hourlyRate;

    public Employee(String name, LocalDate dateOfBirth, int id, LocalDate hireDate,
                    int hoursPerWorkWeek, BigDecimal hourlyRate) {
        super(name, dateOfBirth);
        this.setId(id);
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setHireDate(hireDate);
        this.setHoursPerWorkWeek(hoursPerWorkWeek);
        this.setHourlyRate(hourlyRate);
    }

    public int calculateYearsOfService() {
        if(isNull(this.getTerminationDate())) {
            return Period.between(this.getHireDate(), LocalDate.now()).getYears();
        }else{
            return Period.between(this.getHireDate(), this.getTerminationDate()).getYears();
        }
    }

    public BigDecimal calculateRegularWeekSalary() {
        BigDecimal hours = new BigDecimal(this.hoursPerWorkWeek);
        hours = hours.multiply(this.getHourlyRate());
        return hours.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal calculateWeekPayment(int absenthours) {
        if(!isNull(absenthours) && absenthours > 0){

            BigDecimal hours = new BigDecimal(this.hoursPerWorkWeek - absenthours);
            hours = hours.multiply(this.getHourlyRate());
            return hours.setScale(2, RoundingMode.HALF_EVEN);
        }else{
            return this.calculateRegularWeekSalary();
        }
    }

    public boolean isEmployed() {
        if(!isNull(this.getTerminationDate())){
            return false;
        }else{
            return true;
        }
    }

    public final int getId() {
        return id;
    }

    public void setId(int value) {
        id = value;
    }

    public final LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate value) {
        hireDate = value;
    }

    public final LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate value) {
        terminationDate = value;
    }

    public final int getHoursPerWorkWeek() {
        return hoursPerWorkWeek;
    }

    public void setHoursPerWorkWeek(int value) {
        hoursPerWorkWeek = value;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal value) {
        hourlyRate = value;
    }

}