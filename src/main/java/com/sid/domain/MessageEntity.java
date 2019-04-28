package com.sid.domain;



import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A MessageEntity.
 */
@Entity
@Table(name = "message_entity")
public class MessageEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "lang")
    private String lang;

    @Column(name = "text")
    private String text;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public MessageEntity code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLang() {
        return lang;
    }

    public MessageEntity lang(String lang) {
        this.lang = lang;
        return this;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public MessageEntity text(String text) {
        this.text = text;
        return this;
    }

    public void setText(String text) {
        this.text = text;
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
        MessageEntity messageEntity = (MessageEntity) o;
        if (messageEntity.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), messageEntity.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MessageEntity{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", lang='" + getLang() + "'" +
            ", text='" + getText() + "'" +
            "}";
    }
}
