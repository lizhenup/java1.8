import com.lz.Dao.BlogMapper;
import com.lz.pojo.Blog;
import com.lz.utils.IDutils;
import com.lz.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：lizhen
 * @date ：Created in 2020/8/26 17:35
 * @description：
 * @modified By：
 * @version: $
 */
public class MyTest {
    @Test
    public void addInitBlog() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("这是一个标题");
        blog.setAuthor("lz");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);


        blog.setId(IDutils.getId());
        blog.setTitle("这ye是一个标题");
        mapper.addBlog(blog);
        blog.setId(IDutils.getId());
        blog.setTitle("这hai是一个标题");
        mapper.addBlog(blog);
        session.close();
    }

    @Test
    public void queryBlogIf() {
        SqlSession session = MyBatisUtils.getSqlSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title", "这是一个标题");
        map.put("author", "lz");
        List<Blog> blogs = mapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        session.close();
    }

}
