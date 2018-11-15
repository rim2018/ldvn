package de.ld.ldvn.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|sender")
@Table(name = "LDVN_DZ")
@Entity(name = "ldvn$Dz")
public class Dz extends StandardClientEntity {
    private static final long serialVersionUID = 4165525421846888254L;

    @Column(name = "SENDER")
    protected String sender;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }


}