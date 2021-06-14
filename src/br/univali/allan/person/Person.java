
package br.univali.allan.person;

import java.time.LocalDate;
import java.time.Period;

public abstract class Person {
    /**
     * Construtor da classe (exemplo de geração do javadoc)
     */

    private String name;
    private LocalDate dateOfBirth;


    public Person(String name, LocalDate dateOfBirth) {
    }

    public final String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }

    public final LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate value) {
        dateOfBirth = value;
    }

    public int calculateAge() {
        return Period.between(this.getDateOfBirth(), LocalDate.now()).getYears();
    }

}