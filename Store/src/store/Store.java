/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 * This is the Store interface file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public interface Store {

    /**
     * It is a constant field value.
     */
    static final double COMMISSION_RATE = 0.10;
    

    /**
     * It is a constant field value.
     */
    static final double TAX = 0.14;

    /**
     *
     * @return 
     * @return- This method returns the calculateCommission.
     */
    public double calculateCommission();

    /**
     *
     * @param storeSales - The parameter storeSales is passed.
     * @return - This method returns the remaining store revenue.
     */
    public double calculateRemainingStoreRevenue(double storeSales);

    /**
     * Gets the details of the store.
     *
     * @return - This method returns the details of the store.
     */
    String getStoreDetails();

    /**
     * This method represents a new abstract action for the store.
     *
     * @param inventoryCount - The current count of items in the store's inventory.
     * @return - This method returns some result based on the inventory count.
     */
    boolean performNewStoreAction(int inventoryCount);

}
