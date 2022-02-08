import java.util.ArrayList;

public class CustomerCheck
{
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check)
    {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices()
    {
        double tot = 0.0;
        for (MenuItem item : check) {
            tot += (double) item.getPrice();
        }
        return tot;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies()
    {
        for (MenuItem m : check) {
            if (m.isDailySpecial() || totalPrices() < 40) {
                return false;
            }
        }
        return true;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck()
    {
        double finalCost = totalPrices();
        double discount = 0.0;
        if (couponApplies() == true) {
            discount = finalCost * 0.25;
        }
        int entreeNum = 0;
        for (MenuItem m : check) {
            if (m.isEntree() == true) {
                entreeNum++;
            }
        }
        double tip = 0.0;
        if (entreeNum >= 6) {
            tip = finalCost * 0.20;
        }
        return finalCost + tip - discount;
    }
}
