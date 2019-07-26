package com.fh.shop.biz;

import com.fh.shop.po.BookType;

import java.util.List;

public interface IBookTypeService {
    /**
     * 查询类型
     * @return
     */
    List<BookType> findBookType();
}
