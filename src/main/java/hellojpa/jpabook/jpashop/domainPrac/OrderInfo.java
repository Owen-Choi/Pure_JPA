package hellojpa.jpabook.jpashop.domainPrac;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class OrderInfo {

    private int customer_num;
    private String target_location;
    private LocalDateTime order_time;
    private LocalDateTime deadLine;
}
