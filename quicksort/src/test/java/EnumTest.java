import org.junit.Test;
import quicksort.Job;

/**
 * @author mati
 * @since 2018/9/3 14:18
 */
public class EnumTest {
    @Test
    public void test() {
        Job job = Job.docter;
        System.out.println(job.getName());
    }
}
