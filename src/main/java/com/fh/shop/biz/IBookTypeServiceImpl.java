package com.fh.shop.biz;

import com.fh.shop.mapper.IBookTypeMapper;
import com.fh.shop.po.BookType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("typeService")
public class IBookTypeServiceImpl implements IBookTypeService {
    @Autowired
    private IBookTypeMapper typeMapper;

    /**
     * 查询类型
     * @return
     */
    public List<BookType> findBookType() {
        List<BookType> bookTypes = typeMapper.selectList(null);
        return bookTypes;
    }
}
