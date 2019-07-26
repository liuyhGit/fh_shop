package com.fh.shop.biz;

import com.fh.shop.commons.ServerResponse;
import com.fh.shop.mapper.IBookMapper;
import com.fh.shop.param.BookParam;
import com.fh.shop.po.Book;
import com.fh.shop.vo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("bookService")
public class IBookServiceImpl implements IBookService {
    @Autowired
    private IBookMapper bookMapper;

    /**
     * 添加图书
     * @param book
     * @return
     */
    public ServerResponse addBook(Book book) {
        bookMapper.insert(book);
        return ServerResponse.success();
    }

    /**
     * 分页查询图书表
     * @param bookParam
     * @return
     */
    public ServerResponse findPageList(BookParam bookParam) {
        //查询总条数
        Long bookCount = bookMapper.findBookCount(bookParam);
        List<Books> bookList = bookMapper.findBookList(bookParam);
        Map map = new HashMap();
            map.put("draw",bookParam.getDraw());
            map.put("recordsFiltered",bookCount);
            map.put("recordsTotal",bookCount);
            map.put("data",bookList);
        return ServerResponse.success(map);
    }

    /**
     * 删除图书
     * @param id
     */
    public void deleteBook(long id) {
        bookMapper.deleteById(id);
    }

    /**
     * 回显图书
     * @param id
     * @return
     */
    public Book getBookById(long id) {
        return bookMapper.selectById(id);
    }

    /**
     * 修改图书
     * @param book
     */
    public void updateBook(Book book) {
        bookMapper.updateById(book);
    }

    /**
     * 批量删除
     * @param ids
     */
    public void deleteBacth(long[] ids) {
        //bookMapper.deleteBacth(ids);
        //数组List互转
        List<Integer> listInteger = new ArrayList<Integer>();
        for (long id : ids) {
            listInteger.add(Integer.parseInt(String.valueOf(id)));
        }
        bookMapper.deleteBatchIds(listInteger);
    }
}
