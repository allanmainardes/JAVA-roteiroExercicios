package br.univali.allan.person;

import java.time.LocalDate;
import static java.util.Objects.isNull;

class Student extends Person {
    private int rollNumber;
    private LocalDate enrollmentDate;
    private LocalDate dropDate;

    public Student(String name, LocalDate dateOfBirth, int rollNumber, LocalDate enrollmentDate) {
        super(name, dateOfBirth);
        this.setName(name);
        this.setDateOfBirth(dateOfBirth);
        this.setRollNumber(rollNumber);
        this.setEnrollmentDate(enrollmentDate);
    }

    public boolean isEnrolled() {
        if(!isNull(this.getDropDate())){
            return false;
        }else{
            return true;
        }
    }

    public final int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int value) {
        rollNumber = value;
    }

    public final LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate value) {
        enrollmentDate = value;
    }

    public final LocalDate getDropDate() {
        return dropDate;
    }

    public void setDropDate(LocalDate value) {
        dropDate = value;
    }

}