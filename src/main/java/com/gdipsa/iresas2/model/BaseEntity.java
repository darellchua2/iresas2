package com.gdipsa.iresas2.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity {
    public abstract <T> T getId();
    public abstract <T> void setId(T id);
}
