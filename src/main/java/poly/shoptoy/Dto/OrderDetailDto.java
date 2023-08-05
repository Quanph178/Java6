package poly.shoptoy.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailDto {
    private int orderDetailId;
    private int orderId;
    private int quantity;
    private double price;
    private int productId;
}
