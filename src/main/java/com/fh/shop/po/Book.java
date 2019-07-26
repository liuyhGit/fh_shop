package com.fh.shop.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private static final long serialVersionUID = 2468131914351411547L;

    private Long id;
    private String bookName;
    private Float price;
    private Long typeId;

}
