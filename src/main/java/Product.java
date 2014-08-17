public class Product {
    private String productName;
    private int price;
    private String productDescription;
    private String imageFile;

    public Product(String productName, int price, String description, String imageFile) {
        this.productName = productName;
        this.price = price;
        productDescription = description;
        this.imageFile = imageFile;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
}
