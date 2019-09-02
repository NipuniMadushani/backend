package lk.ijse.absd.springmvc.entity;

import org.springframework.security.core.userdetails.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @ManyToOne
//    private User user;

    @Column(name = "order_total")
    private double orderTotal;


    @Column(name = "order_count")
    private int orderCount;

    @Column(name="order_date")
    private String orderDate;

    @Column(name = "delivery_address")
    private String address;

    private String imageUrl;

    public OrderDetail() {
    }

    public OrderDetail(double orderTotal, int orderCount, String orderDate, String address, String imageUrl) {
        this.orderTotal = orderTotal;
        this.orderCount = orderCount;
        this.orderDate = orderDate;
        this.address = address;
        this.imageUrl = imageUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", orderTotal=" + orderTotal +
                ", orderCount=" + orderCount +
                ", orderDate='" + orderDate + '\'' +
                ", address='" + address + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
