package com.digitaldags.tryhardcleanarchitecture.component.common.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.text.SimpleDateFormat;
import java.util.Date;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@JsonNaming(PropertyNamingStrategy.LowerCaseWithUnderscoresStrategy.class)
@Data
public abstract class BaseEntity {
    @JsonIgnore
    @CreationTimestamp
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date")
    private Date createDate;

    @JsonIgnore
    @UpdateTimestamp
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_date")
    private Date modifyDate;

    @JsonProperty("created_at")
    public String getFormattedCreateDate() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(createDate != null ? createDate : new Date());
    }

    @JsonProperty("modified_at")
    public String getFormattedModifyDate() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").format(modifyDate != null ? modifyDate : new Date());
    }
}
