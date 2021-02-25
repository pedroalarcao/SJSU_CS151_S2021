/**
 * @author Pedro Augusto
 * @version 1.0
 *
 * This Product class consists of private final variables for information on a product
 * Each variable has a getter only
 * It is a immutable class since the class is declared as final,
 * Its constructor is also fully parameterized
 *
 *
 */
final class Product {

    /**
     * productName name of the product
     */
    private final String productName;
    /**
     * productDescription description of the product
     */
    private final String productDescription;
    /**
     * productPrice price of the product
     */
    private final double productPrice;
    /**
     * maxQuantity the max quantity of the product
     */
    private final int maxQuantity;

    /**
     *
     * This constructor for a Product is fully parameterized
     * @param productName
     * @param productDescription
     * @param productPrice
     * @param maxQuantity
     */
    Product(String productName, String productDescription, double productPrice, int maxQuantity){
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.maxQuantity = maxQuantity;
    }

    /**
     *
     * This returns the current product name of this Product
     * @return this Product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     *
     * This returns the current product description of this Product
     * @return this Product description
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     *
     * This returns the current product price of this Product
     * @return this Product price
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     *
     * This returns the current product max quantity of this Product
     * @return this Product max quantity
     */
    public int getMaxQuantity() {
        return maxQuantity;
    }

    /**
     *
     * This overrides the default toString class and returns a string with Product info
     * @return this Product string info of all variables
     */
    @Override
    public String toString() {
        return ("Product name: " + productName + '\n' + "Product description: " + productDescription + '\n' +
                "Product price: $" + productPrice + '\n' + "Max quantity: " +  maxQuantity);
    }
}
