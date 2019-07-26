package com.fh.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.shop.param.BookParam;
import com.fh.shop.po.Book;
import com.fh.shop.vo.Books;

import java.util.List;

public interface IBookMapper extends BaseMapper<Book> {

    /**
     * 添加图书
     * @param book
     */
    void addBook(Book book);

    /**
     * 查询总条数
     * @param bookParam
     * @return
     */
    Long findBookCount(BookParam bookParam);

    /**
     * 查询当前页数据
     * @param bookParam
     * @return
     */
    List<Books> findBookList(BookParam bookParam);

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
