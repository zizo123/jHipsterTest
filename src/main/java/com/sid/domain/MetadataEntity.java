package com.sid.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A MetadataEntity.
 */
@Entity
@Table(name = "metadata_entity")
public class MetadataEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "jhi_key")
    private String key;

    @Column(name = "jhi_value")
    private String value;

    @ManyToOne
    @JsonIgnoreProperties("metadataEntities")
    private AttributEntity attribut4;

    @ManyToOne
    @JsonIgnoreProperties("metadataEntities")
    private DictionaryConfigEntity dictionaryConfig;

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

    public MetadataEntity key(String key) {
        this.key = key;
        return this;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public MetadataEntity value(String value) {
        this.value = value;
        return this;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AttributEntity getAttribut4() {
        return attribut4;
    }

    public MetadataEntity attribut4(AttributEntity attributEntity) {
        this.attribut4 = attributEntity;
        return this;
    }

    public void setAttribut4(AttributEntity attributEntity) {
        this.attribut4 = attributEntity;
    }

    public DictionaryConfigEntity getDictionaryConfig() {
        return dictionaryConfig;
    }

    public MetadataEntity dictionaryConfig(DictionaryConfigEntity dictionaryConfigEntity) {
        this.dictionaryConfig = dictionaryConfigEntity;
        return this;
    }

    public void setDictionaryConfig(DictionaryConfigEntity dictionaryConfigEntity) {
        this.dictionaryConfig = dictionaryConfigEntity;
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
        MetadataEntity metadataEntity = (MetadataEntity) o;
        if (metadataEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), metadataEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MetadataEntity{" +
            "id=" + getId() +
            ", key='" + getKey() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }
}
