/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author Asad
 */
public class Shoes extends Item{
    
       
    private String brand;     // The brand of the shoes
    private String category;  // The category of the shoes
    private int size;         // The size of the shoes

    // Constructor to initialize the Shoes object
    public Shoes(String brand, String category, int size, int price, int quantity) {
        super(price, quantity);  // Call the constructor of the superclass (Item)
        this.brand = brand;
        this.category = category;
        this.size = size;
    }

    // Getter for the brand
    public String getBrand() {
        return brand;
    }

    // Setter for the brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for the category
    public String getCategory() {
        return category;
    }

    // Setter for the category
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter for the size
    public int getSize() {
        return size;
    }

    // Setter for the size
    public void setSize(int size) {
        this.size = size;
    }

    // Override the toString() method to provide a string representation of the Shoes object
    @Override
    public String toString() {
        return "Shoes{" + "Brand: " + brand + ", Category: " + category + ", Size:" + size +", Price: € " + this.getPrice() + ", Quantity:" + this.getQuantity() + '}';
    }

    
}

