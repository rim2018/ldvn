package de.ld.ldvn.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

@Table(name = "LDVN_UB")
@Entity(name = "ldvn$Ub")
public class Ub extends StandardClientEntity {
    private static final long serialVersionUID = -617152590721120160L;

    @NotNull
    @Column(name = "NUMMER", nullable = false)
    protected Integer nummer;

    @Column(name = "BETRAG")
    protected BigDecimal betrag;

    public void setNummer(Integer nummer) {
        this.nummer = nummer;
    }

    public Integer getNummer() {
        return nummer;
    }

    public void setBetrag(BigDecimal betrag) {
        this.betrag = betrag;
    }

    public BigDecimal getBetrag() {
        return betrag;
    }


}