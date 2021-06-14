
package br.univali.allan.person;

import java.math.BigDecimal;

public enum AcademicDegree {
    BACHELOR("Bachelor", "0.00"),
    MASTER ("Master", "0.15"),
    DOCTORATE("Doctorate", "0.30");
    private String description;
    private String bonus;

    private AcademicDegree(String description, String bonus) {
        this.description = description;
        this.bonus = bonus;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getBonus() {
        return new BigDecimal(bonus);
    }



}