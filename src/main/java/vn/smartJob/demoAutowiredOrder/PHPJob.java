package vn.smartJob.demoAutowiredOrder;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 42)
public class PHPJob extends Job {
    @Override
    public String toString() {
        return "PHP job";
    }
}
