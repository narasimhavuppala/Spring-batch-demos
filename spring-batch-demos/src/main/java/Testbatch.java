import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testbatch {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("batch-app-config.xml");
		
		JobLauncher launcher=context.getBean(SimpleJobLauncher.class);
		System.out.println(launcher);

	}

}
