import com.self.mybatis.entity.Emp;
import com.self.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class testDemo {

    @Test
    public void test(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            Integer i = mapper.insertEmp(new Emp(8011,null,null,null,new Date(),null,null,null));
            System.out.println(i);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testselectAllUser(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            List<Emp> emps = mapper.selectAllEmp();
            System.out.println(emps);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testDeleteByEmpno(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            int i = mapper.deleteByEmpNo(8014);
            System.out.println(i);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void testselectLike(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            List<Emp> y = mapper.selectmplike("y");
            System.out.println(y);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void batchDelete(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            int[] empnos =new int[]{8001,8002,8003,8004,8005};
            int i = mapper.batchDelete(empnos);
            System.out.println(i);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void selectByTableName(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            List<Emp> emp = mapper.selectByTableName("emp");
            System.out.println(emp);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void selectByCondition(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
            Date date = new Date();
            List<Emp> emp = mapper.selectByCondition(new Emp(8013,null,null,null,new Date(),null,null,null));
            System.out.println(emp);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
