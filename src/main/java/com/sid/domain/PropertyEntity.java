package com.sid.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A PropertyEntity.
 */
@Entity
@Table(name = "property_entity")
public class PropertyEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jhi_value")
    private String value;

    @ManyToOne
    @JsonIgnoreProperties("propertyEntities")
    private AttributEntity attribut5;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public PropertyEntity value(String value) {
        this.value = value;
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AttributEntity getAttribut5() {
        return attribut5;
    }

    public PropertyEntity attribut5(AttributEntity attributEntity) {
        this.attribut5 = attributEntity;
        return this;
    }

    public void setAttribut5(AttributEntity attributEntity) {
        this.attribut5 = attributEntity;
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
        PropertyEntity propertyEntity = (PropertyEntity) o;
        if (propertyEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), propertyEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PropertyEntity{" +
            "id=" + getId() +
            ", value='" + getValue() + "'" +
            "}";
    }
}
