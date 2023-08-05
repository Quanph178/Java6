package poly.shoptoy.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private int quanlotId;
    private String name;
    private int quantity;
    private int categoryId;
    private double price;
}
