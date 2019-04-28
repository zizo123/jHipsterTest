package com.sid.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A AttributEntity.
 */
@Entity
@Table(name = "attribut_entity")
public class AttributEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties("attributEntities")
    private DictionaryEntity dictionary;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DictionaryEntity getDictionary() {
        return dictionary;
    }

    public AttributEntity dictionary(DictionaryEntity dictionaryEntity) {
        this.dictionary = dictionaryEntity;
        return this;
    }

    public void setDictionary(DictionaryEntity dictionaryEntity) {
        this.dictionary = dictionaryEntity;
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
        AttributEntity attributEntity = (AttributEntity) o;
        if (attributEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), attributEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AttributEntity{" +
            "id=" + getId() +
            "}";
    }
}
