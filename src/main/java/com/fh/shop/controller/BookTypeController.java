package com.fh.shop.controller;

import com.fh.shop.biz.IBookTypeService;
import com.fh.shop.commons.ServerResponse;
import com.fh.shop.po.BookType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("types")
@CrossOrigin
public class BookTypeController {
    @Resource(name = "typeService")
    private IBookTypeService typeService;

    @GetMapping
    public ServerResponse findTypeList(){
        List<BookType> bookType = typeService.findBookType();
        return ServerResponse.success(bookType);
    }
}
