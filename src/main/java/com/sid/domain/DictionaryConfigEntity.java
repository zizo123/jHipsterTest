package com.sid.domain;



import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DictionaryConfigEntity.
 */
@Entity
@Table(name = "dictionary_config_entity")
public class DictionaryConfigEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jhi_key")
    private String key;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public DictionaryConfigEntity key(String key) {
        this.key = key;
        return this;
    }

    public void setKey(String key) {
        this.key = key;
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
        DictionaryConfigEntity dictionaryConfigEntity = (DictionaryConfigEntity) o;
        if (dictionaryConfigEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), dictionaryConfigEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "DictionaryConfigEntity{" +
            "id=" + getId() +
            ", key='" + getKey() + "'" +
            "}";
    }
}
