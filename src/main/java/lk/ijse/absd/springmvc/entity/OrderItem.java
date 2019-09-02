//package lk.ijse.absd.springmvc.entity;
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "order_item")
//public class OrderItem implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//
//    @OneToOne
//    private Product product;
//
//    @ManyToOne
//    @JoinColumn(name = "order_id")
//    private OrderDetail orderDetail;
//    @Column(name = "buying_price")
//    private double buyingPrice;
//
//    @Column (name = "product_count")
//    private int productCount;
//
//    private double total;
//
//    public OrderItem(Product product) {
//        this.product = product;
//    }
//
//    public OrderItem(Product product, OrderDetail orderDetail, double buyingPrice, int productCount, double total) {
//        this.product = product;
//        this.orderDetail = orderDetail;
//        this.buyingPrice = buyingPrice;
//        this.productCount = productCount;
//        this.total = total;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    public OrderDetail getOrderDetail() {
//        return orderDetail;
//    }
//
//    public void setOrderDetail(OrderDetail orderDetail) {
//        this.orderDetail = orderDetail;
//    }
//
//    public double getBuyingPrice() {
//        return buyingPrice;
//    }
//
//    public void setBuyingPrice(double buyingPrice) {
//        this.buyingPrice = buyingPrice;
//    }
//
//    public int getProductCount() {
//        return productCount;
//    }
//
//    public void setProductCount(int productCount) {
//        this.productCount = productCount;
//    }
//
//    public double getTotal() {
//        return total;
//    }
//
//    public void setTotal(double total) {
//        this.total = total;
//    }
//
//    @Override
//    public String toString() {
//        return "OrderItem{" +
//                "id=" + id +
//                ", product=" + product +
//                ", orderDetail=" + orderDetail +
//                ", buyingPrice=" + buyingPrice +
//                ", productCount=" + productCount +
//                ", total=" + total +
//                '}';
//    }
//}
