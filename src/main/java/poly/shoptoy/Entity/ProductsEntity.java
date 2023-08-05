package poly.shoptoy.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "dochoi", catalog = "")
public class ProductsEntity {

    @Id
    @Column(name = "dochoi_id")
    private int dochoiId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "quantity")
    private int quantity;
    @Basic
    @Column(name = "category_id")
    private int categoryId;
    @Basic
    @Column(name = "price")
    private double price;
    @Basic
    @Column(name = "img")
    private String img;

    public int getDochoiId() {
        return dochoiId;
    }

    public void setDochoiId(int dochoiId) {
        this.dochoiId = dochoiId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return dochoiId == that.dochoiId && quantity == that.quantity && categoryId == that.categoryId && Double.compare(that.price, price) == 0 && Objects.equals(name, that.name) && Objects.equals(img, that.img);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dochoiId, name, quantity, categoryId, price);
    }


}
