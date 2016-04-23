package ecommerce;

/**
 * An example product for use in the example shopping cart.
 * @author <a href="mailto:mike@clarkware.com">Mike Clark</a>
 * @author <a href="http://www.clarkware.com">Clarkware Consulting, Inc.</a>
 */

public class Product {

    private String _title;
    private double _price;
    private String _description;

    public Product() {

    }

    /**
     * Constructs a <codigoenlinea>Product</codigoenlinea>.
     * @param title Product title.
     * @param price Product price.
     */
    public Product(String title, double price) {
        _title = title;
        _price = price;
    }

    public Product(String title, double price, String description) {
        _title = title;
        _price = price;
        _description = description;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    /**
     * Returns the product title.
     * @return Title.
     */
    public String getTitle() {
        return _title;
    }

    /**
     * Returns the product price.
     * @return Price.
     */
    public double getPrice() {
        return _price;
    }

    /**
     * Returns the Description title.
     * @return description.
     */
    public String getDescription() {
        return _description;
    }


    /**
     * Tests product equality.
     * @return true if the products
     *         are equal.
     */
    public boolean equals(Object o) {

        if (o instanceof Product) {
            Product p = (Product)o;
            return p.getTitle().equals(_title);
        }

        return false;
    }

    @Override
    public String toString() {
        return  _title + ',' + _price + ", " + _description;
    }
}