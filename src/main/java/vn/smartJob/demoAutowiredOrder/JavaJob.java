package vn.smartJob.demoAutowiredOrder;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 3)
public class JavaJob extends Job {

}
