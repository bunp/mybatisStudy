import com.self.mybatis.entity.ClassName;
import com.self.mybatis.entity.Emp;
import com.self.mybatis.entity.Stu;
import com.self.mybatis.mapper.ClassNameMapper;
import com.self.mybatis.mapper.EmpMapper;
import com.self.mybatis.mapper.StuMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class testStu {

    @Test
    public void selectManytoOne(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            StuMapper mapper = sqlSession.getMapper(StuMapper.class);
            Stu stu = mapper.selectByStuId(3);
            System.out.println(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void selectManytoOne2(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            ClassNameMapper mapper = sqlSession.getMapper(ClassNameMapper.class);
            ClassName selectonetomany = mapper.selectonetomany(1);
            System.out.println(selectonetomany);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void selectonetomany(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            ClassNameMapper mapper = sqlSession.getMapper(ClassNameMapper.class);
            ClassName selectonetomany = mapper.selectonetomany(1);
            System.out.println(selectonetomany);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void batchInsert(){
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSession sqlSession = sqlSessionFactoryBuilder.build(resourceAsStream).openSession(true);

            StuMapper mapper = sqlSession.getMapper(StuMapper.class);
            Stu stu1 = new Stu(100, "qwe", 3);
            Stu stu2 =new Stu(101,"weee",1);
            Stu stu3 =new Stu(102,"qwe",3);
            Stu stu4 = new Stu(103,"qwe",2);
            List<Stu> stus = Arrays.asList(stu1, stu2, stu3, stu4);
            int i = mapper.batchInsert(stus);
            System.out.println(i);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
