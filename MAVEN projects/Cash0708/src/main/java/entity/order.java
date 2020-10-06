package entity;

import commen.OrderStatus;
import lombok.Data;

@Data
public class order {
    private String  id;
    private Integer account_Id;
    private String account_name;
    private String create_time;
    private String finish_time;
    private Integer actual_amount;
    private Integer total_money;
    private OrderStatus order_status;
}
