package com.fh.shop.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("t_book")
public class books implements Serializable {
    private static final long serialVersionUID = 4995170026678379697L;
}
