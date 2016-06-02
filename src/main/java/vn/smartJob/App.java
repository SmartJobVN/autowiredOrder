package vn.smartJob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import vn.smartJob.demoAutowiredOrder.Company;

public class App {

    public static void main(String... args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Company company = applicationContext.getBean(Company.class);
        System.out.println(company.getJobs());
    }

}

// Kết quả
// [vn.smartJob.demoAutowiredOrder.CsharpJob@4df828d7, vn.smartJob.demoAutowiredOrder.JavaJob@b59d31, PHP job]