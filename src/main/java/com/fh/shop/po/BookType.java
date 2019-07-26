package com.fh.shop.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class BookType implements Serializable {
    private static final long serialVersionUID = -7567770745491951129L;
    private Long typeId;
    private String typeName;
}
