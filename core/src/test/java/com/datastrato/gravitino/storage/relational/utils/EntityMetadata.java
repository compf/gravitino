/*
 * Copyright 2024 Datastrato Pvt Ltd.
 * This software is licensed under the Apache License version 2.
 */
package com.datastrato.gravitino.storage.relational.utils;
public class EntityMetadata {

    private java.lang.Long id;

    private java.lang.String name;

    private java.lang.String comment;

    private java.util.Map<java.lang.String,java.lang.String> properties;

    public java.lang.Long getId() {
        return id;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getComment() {
        return comment;
    }

    public java.util.Map getProperties() {
        return properties;
    }

    public void setId(java.lang.Long id) {
        this.id=id;
    }

    public void setName(java.lang.String name) {
        this.name=name;
    }

    public void setComment(java.lang.String comment) {
        this.comment=comment;
    }

    public void setProperties(java.util.Map properties) {
        this.properties=properties;
    }

    public EntityMetadata    (java.lang.Long id,java.lang.String name,java.lang.String comment,java.util.Map properties){
        this.id    =    id;
        this.name    =    name;
        this.comment    =    comment;
        this.properties    =    properties;
}
}
