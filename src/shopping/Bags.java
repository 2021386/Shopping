/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author Asad
 */
public class Bags extends Item{
    
    private String brand;    // The brand of the bag
    private String type;     // The type of the bag
    private String fabric;   // The fabric of the bag
    private String quality;  // The quality of the bag
    private String color;    // The color of the bag

    // Constructor to initialize the Bags object
    public Bags(String brand, String type, String fabric, String quality, String color, int price, int quantity) {
        super(price, quantity);  // Call the superclass constructor to initialize price and quantity
        this.brand = brand;
        this.type = type;
        this.fabric = fabric;
        this.quality = quality;
        this.color = color;
    }

    // Getter for the brand
    public String getBrand() {
        return brand;
    }

    // Setter for the brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for the type
    public String getType() {
        return type;
    }

    // Setter for the type
    public void setType(String type) {
        this.type = type;
    }

    // Getter for the fabric
    public String getFabric() {
        return fabric;
    }

    // Setter for the fabric
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    // Getter for the quality
    public String getQuality() {
        return quality;
    }

    // Setter for the quality
    public void setQuality(String quality) {
        this.quality = quality;
    }

    // Getter for the color
    public String getColor() {
        return color;
    }

    // Setter for the color
    public void setColor(String color) {
        this.color = color;
    }

    // Override the toString() method to provide a string representation of the Bags object
    @Override
    public String toString() {
        return "Bags{" + "Brand: " + brand + ", Type: " + type + ", Fabric: " + fabric + ", Quality: " + quality + ", Color: " + color + ", Price: €" + this.getPrice()+ ", Quantity: " + this.getQuantity() +'}';
    }
}

    
    
    


