package poly.shoptoy.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orderdetails", schema = "dochoi", catalog = "")
public class OrderdetailsEntity {

 @Id
    @Column(name = "order_detai_id")
    private int orderDetaiId;
    @Basic
    @Column(name = "order_id")
    private int orderId;
    @Basic
    @Column(name = "quantity")
    private int quantity;
    @Basic
    @Column(name = "price")
    private double price;
    @Basic
    @Column(name = "product_id")
    private int productId;

    public int getOrderDetaiId() {
        return orderDetaiId;
    }

    public void setOrderDetaiId(int orderDetaiId) {
        this.orderDetaiId = orderDetaiId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderdetailsEntity that = (OrderdetailsEntity) o;
        return orderDetaiId == that.orderDetaiId && orderId == that.orderId && quantity == that.quantity && Double.compare(that.price, price) == 0 && productId == that.productId;
    }


}
