package com.fh.shop.biz;

import com.fh.shop.commons.ServerResponse;
import com.fh.shop.param.BookParam;
import com.fh.shop.po.Book;

public interface IBookService {

    /**
     * 添加图书
     * @param book
     * @return
     */
    ServerResponse addBook(Book book);

    /**
     * 分页查询
     * @param bookParam
     * @return
     */
    ServerResponse findPageList(BookParam bookParam);
    /**
     * 删除图书
     * @param id
     */
    void deleteBook(long id);

    /**
     * 回显
     * @param id
     * @return
     */
    Book getBookById(long id);

    /**
     * 修改图书
     * @param book
     */
    void updateBook(Book book);

    /**
     * 批量删除
     * @param ids
     */
    void deleteBacth(long[] ids);
}
