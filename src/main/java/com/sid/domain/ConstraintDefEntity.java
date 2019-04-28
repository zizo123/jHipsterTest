package com.sid.domain;



import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A ConstraintDefEntity.
 */
@Entity
@Table(name = "constraint_def_entity")
public class ConstraintDefEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "key_1")
    private String key1;

    @Column(name = "key_2")
    private String key2;

    @Column(name = "key_3")
    private String key3;

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

    public ConstraintDefEntity name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey1() {
        return key1;
    }

    public ConstraintDefEntity key1(String key1) {
        this.key1 = key1;
        return this;
    }

    public void setKey1(String key1) {
        this.key1 = key1;
    }

    public String getKey2() {
        return key2;
    }

    public ConstraintDefEntity key2(String key2) {
        this.key2 = key2;
        return this;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getKey3() {
        return key3;
    }

    public ConstraintDefEntity key3(String key3) {
        this.key3 = key3;
        return this;
    }

    public void setKey3(String key3) {
        this.key3 = key3;
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
        ConstraintDefEntity constraintDefEntity = (ConstraintDefEntity) o;
        if (constraintDefEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), constraintDefEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ConstraintDefEntity{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", key1='" + getKey1() + "'" +
            ", key2='" + getKey2() + "'" +
            ", key3='" + getKey3() + "'" +
            "}";
    }
}
