package poly.shoptoy.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private int orderId;
    private double total;
    private String creator;
    private String date;
    private String address;
    private String phone;
}
