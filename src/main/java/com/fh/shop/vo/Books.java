package com.fh.shop.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_book")
public class Books implements Serializable {
    private static final long serialVersionUID = 4995170026678379697L;
    private Long id;
    @TableField("bookName")
    private String bookName;
    private Float price;
    @TableField("typeName")
    private String typeName;
}
