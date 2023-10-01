/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopping;

/**
 *
 * @author Asad
 */
public class Item {
    private int price;     // The price of the item
    private int quantity;  // The quantity of the item

    // Constructor to initialize the Item object
    public Item(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    // Getter for the price
    public int getPrice() {
        return price;
    }

    // Setter for the price
    public void setPrice(int price) {
        this.price = price;
    }

    // Getter for the quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for the quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}

