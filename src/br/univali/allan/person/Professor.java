
package br.univali.allan.person;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import static java.util.Objects.isNull;

public class Professor extends Employee{

    private AcademicDegree academicDegree;

    public Professor(String name, LocalDate dateOfBirth, int id, LocalDate hireDate,
                     int hoursPerWorkWeek, BigDecimal hourlyRate, AcademicDegree academicDegree) {
        super(name, dateOfBirth, id, hireDate, hoursPerWorkWeek, hourlyRate);
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setId(id);
        this.setHireDate(hireDate);
        this.setHoursPerWorkWeek(hoursPerWorkWeek);
        this.setHourlyRate(hourlyRate);
        this.setAcademicDegree(academicDegree);
    }

    public final AcademicDegree getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(AcademicDegree value) {
        academicDegree = value;
    }

    public BigDecimal calculateAcademicBonus() {
        BigDecimal bonus = super.getHourlyRate().multiply(academicDegree.getBonus());
        return bonus.setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public BigDecimal getHourlyRate(){
        return super.getHourlyRate().add(calculateAcademicBonus());
    }
}