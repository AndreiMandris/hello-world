/*
 * example of enum class
 */
package newpackage;

/**
 *
 * @author Andrei
 * @version 1.0
 */
public enum Coffee {
    SMALL, MEDIUM(250), BIG(300); // apelez aici constructorul

    private double quantity;

    Coffee() {

    }

    Coffee(double quantity) {
        this.quantity = quantity;
    }

    public void getQuantity() {
        System.out.println("The quantity of coffe is:" + this.quantity);
    }
/**
 * 
 * @param quantity sets the current quantity 
 */
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

}
