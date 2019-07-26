package com.fh.shop.controller;

import com.fh.shop.biz.IBookService;
import com.fh.shop.commons.ServerResponse;
import com.fh.shop.param.BookParam;
import com.fh.shop.po.Book;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {
    @Resource(name = "bookService")
    private IBookService bookService;

    /**
     * 添加图书
     * @param book
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ServerResponse addBook(Book book){
        bookService.addBook(book);
        return ServerResponse.success();
    }

    /**
     * 分页查询图书
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ServerResponse findBookList(BookParam bookParam){
        return bookService.findPageList(bookParam);
    }

    /**
     * 删除图书
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ServerResponse deleteBook(@PathVariable long id){
        bookService.deleteBook(id);
        return ServerResponse.success();
    }

    /**
     * 回显图书
     * @param bookId
     * @return
     */
    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    public ServerResponse findBookList(@PathVariable("id") long bookId){
        Book book = bookService.getBookById(bookId);
        return ServerResponse.success(book);
    }

    /**
     * 修改图书
     * @param book
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ServerResponse updateBook(@RequestBody Book book){
        bookService.updateBook(book);
        return ServerResponse.success();
    }

    /**
     * 批量删除
     * @return
     */
    @RequestMapping(value = "bacth/{ids}",method = RequestMethod.DELETE)
    public ServerResponse deleteBacth(@PathVariable("ids") long[] bookIds){
        bookService.deleteBacth(bookIds);
        return ServerResponse.success();
    }
}
