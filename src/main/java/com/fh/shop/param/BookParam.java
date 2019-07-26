package com.fh.shop.param;

import com.fh.shop.page.PageBean;
import lombok.Data;

import java.io.Serializable;

@Data
public class BookParam extends PageBean implements Serializable {
    private static final long serialVersionUID = 4866154178164807540L;

    private String bookName;
    private Float minPrice;
    private Float maxPrice;

}
