import com.xp.dao.GradeDao;
import com.xp.dao.StudentDao;
import com.xp.pojo.Grade;
import com.xp.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Climb.Xu
 * @date 2020/3/31 16:36
 */
public class TestDao {
    @Test
    public void test() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentDao bean1 = applicationContext.getBean(StudentDao.class);
        GradeDao bean2 = applicationContext.getBean(GradeDao.class);
//        for (Student student : bean1.getAll()) {
//            System.out.println(student);
//        }
//        System.out.println(bean1.get(1001));
//        for (Grade grade : bean2.getGrades()) {
//            System.out.println(grade);
//        }
    }
}
