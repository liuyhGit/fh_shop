package booktest;

import com.fh.shop.mapper.IBookMapper;
import com.fh.shop.po.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-common.xml"})
public class TestBook extends AbstractJUnit4SpringContextTests {
   @Autowired
    private IBookMapper bookMapper;
    @Test
    public void testAddBook(){
        Book book = new Book();
        book.setBookName("三国2");
        bookMapper.addBook(book);
        System.out.println("添加成功");
    }
    @Test
    public void testdelBook(){
        bookMapper.deleteBook(2);
        System.out.println("删除成功");
    }
}
