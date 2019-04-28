package com.sid.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A AttributDefEntity.
 */
@Entity
@Table(name = "attribut_def_entity")
public class AttributDefEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "path")
    private String path;

    @Column(name = "multi")
    private Boolean multi;

    @Column(name = "tech_order")
    private Integer techOrder;

    @Column(name = "parent_id")
    private Long parentId;

    @ManyToOne
    @JsonIgnoreProperties("attributDefEntities")
    private AttributEntity attributDef;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public AttributDefEntity name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public AttributDefEntity description(String description) {
        this.description = description;
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public AttributDefEntity path(String path) {
        this.path = path;
        return this;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean isMulti() {
        return multi;
    }

    public AttributDefEntity multi(Boolean multi) {
        this.multi = multi;
        return this;
    }

    public void setMulti(Boolean multi) {
        this.multi = multi;
    }

    public Integer getTechOrder() {
        return techOrder;
    }

    public AttributDefEntity techOrder(Integer techOrder) {
        this.techOrder = techOrder;
        return this;
    }

    public void setTechOrder(Integer techOrder) {
        this.techOrder = techOrder;
    }

    public Long getParentId() {
        return parentId;
    }

    public AttributDefEntity parentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public AttributEntity getAttributDef() {
        return attributDef;
    }

    public AttributDefEntity attributDef(AttributEntity attributEntity) {
        this.attributDef = attributEntity;
        return this;
    }

    public void setAttributDef(AttributEntity attributEntity) {
        this.attributDef = attributEntity;
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
        AttributDefEntity attributDefEntity = (AttributDefEntity) o;
        if (attributDefEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), attributDefEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AttributDefEntity{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", path='" + getPath() + "'" +
            ", multi='" + isMulti() + "'" +
            ", techOrder=" + getTechOrder() +
            ", parentId=" + getParentId() +
            "}";
    }
}
