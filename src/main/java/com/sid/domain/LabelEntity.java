package com.sid.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A LabelEntity.
 */
@Entity
@Table(name = "label_entity")
public class LabelEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonIgnoreProperties("labelEntities")
    private AttributEntity attribut2;

    @ManyToOne
    @JsonIgnoreProperties("labelEntities")
    private MessageEntity message;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AttributEntity getAttribut2() {
        return attribut2;
    }

    public LabelEntity attribut2(AttributEntity attributEntity) {
        this.attribut2 = attributEntity;
        return this;
    }

    public void setAttribut2(AttributEntity attributEntity) {
        this.attribut2 = attributEntity;
    }

    public MessageEntity getMessage() {
        return message;
    }

    public LabelEntity message(MessageEntity messageEntity) {
        this.message = messageEntity;
        return this;
    }

    public void setMessage(MessageEntity messageEntity) {
        this.message = messageEntity;
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
        LabelEntity labelEntity = (LabelEntity) o;
        if (labelEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), labelEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "LabelEntity{" +
            "id=" + getId() +
            "}";
    }
}
