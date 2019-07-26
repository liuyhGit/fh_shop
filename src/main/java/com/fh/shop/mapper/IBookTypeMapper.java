package com.fh.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.shop.po.BookType;

import java.util.List;

public interface IBookTypeMapper extends BaseMapper<BookType> {
    /**
     * 查询类型
     * @return
     */
    List<BookType> findBookType();
}
