package vn.smartJob.demoAutowiredOrder;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 2)
public class CsharpJob extends Job {

}
