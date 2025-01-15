package model;

/**
 * Represents a product (Produkt) with an ID, name, price, and seasonal information (Jahreszeit).
 * The class provides getters and setters for the product's attributes.
 */
public class Medikamente implements HasID {

    private int id;
    private String name;
    private int price;
    private String krankenheit;

    /**
     * Constructor for the Medikamente class
     * @param id , the id of the Medikamente
     * @param name,the name of the Medikamente
     * @param price, the price of the Medikamente
     * @param krankenheit,the jahreszeit of the Medikamente
     */
    public Medikamente(Integer id,String name, int price, String krankenheit) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.krankenheit = krankenheit;
    }

    /**
     * Represents a medicament with an ID, name, price, and krankenheit.
     * The class provides getters and setters for the product's attributes.
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Gets the name of the product.
     *
     * @return The product's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the krankenheit associated with the patient.
     *
     * @return krankenheit.
     */
    public String getKrankenheit() {
        return krankenheit;
    }

    /**
     * Sets the name of the medicamente.
     *
     * @param name The new name of the medicamente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the krankenheit of the medicament.
     *
     * @param krankenheit The new season for the medicamnet.
     */
    public void setKrankenheit(String krankenheit) {
        this.krankenheit = krankenheit;
    }

    /**
     * Sets the price of the medicament.
     *
     * @param price The new price for the medicament.
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     *
     * @return a representation of a product ,as a String concatenation
     */
    @Override
    public String toString() {
        return  "id=" +id+
                "name=" + name  +
                ", price=" + price +
                ", krankenheit=" + krankenheit;

    }

}