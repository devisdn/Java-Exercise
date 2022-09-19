package parents;

public class CartItem {
    private Product product;
    private Integer quantity;
    private Double totalPrice;

    public CartItem() {
        super();
    }

    public CartItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
        calculateTotalPrice();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotalPrice() {
        setTotalPrice(getQuantity() * getProduct().getPrice());
    }
}
