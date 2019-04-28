package com.sid.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A ConstraintEntity.
 */
@Entity
@Table(name = "constraint_entity")
public class ConstraintEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value_1")
    private String value1;

    @Column(name = "value_2")
    private String value2;

    @Column(name = "value_3")
    private String value3;

    @ManyToOne
    @JsonIgnoreProperties("constraintEntities")
    private AttributEntity attribut1;

    @ManyToOne
    @JsonIgnoreProperties("constraintEntities")
    private ConstraintDefEntity constraint;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue1() {
        return value1;
    }

    public ConstraintEntity value1(String value1) {
        this.value1 = value1;
        return this;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public ConstraintEntity value2(String value2) {
        this.value2 = value2;
        return this;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public ConstraintEntity value3(String value3) {
        this.value3 = value3;
        return this;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public AttributEntity getAttribut1() {
        return attribut1;
    }

    public ConstraintEntity attribut1(AttributEntity attributEntity) {
        this.attribut1 = attributEntity;
        return this;
    }

    public void setAttribut1(AttributEntity attributEntity) {
        this.attribut1 = attributEntity;
    }

    public ConstraintDefEntity getConstraint() {
        return constraint;
    }

    public ConstraintEntity constraint(ConstraintDefEntity constraintDefEntity) {
        this.constraint = constraintDefEntity;
        return this;
    }

    public void setConstraint(ConstraintDefEntity constraintDefEntity) {
        this.constraint = constraintDefEntity;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConstraintEntity constraintEntity = (ConstraintEntity) o;
        if (constraintEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), constraintEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ConstraintEntity{" +
            "id=" + getId() +
            ", value1='" + getValue1() + "'" +
            ", value2='" + getValue2() + "'" +
            ", value3='" + getValue3() + "'" +
            "}";
    }
}
