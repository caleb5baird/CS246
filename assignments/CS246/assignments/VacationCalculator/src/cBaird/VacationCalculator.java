package cBaird;

import java.util.ArrayList;
import java.util.List;

public class VacationCalculator {
    public static void main (String[] args) {
        VacationCalculator vc = new VacationCalculator();

        // Calculate some vacation costs
        float japanCost = vc.calculateVacationCost(Destination.Japan);

        System.out.println("The cost for japan is " + japanCost);
    }

    /**
     * Calculates the total cost for vacationing at a given location for
     * a specific number of nights.
     *
     * @param  dest the destination of the vacation
     * @return      the total cost of the vacation
     */
    public float calculateVacationCost(Destination dest) {
        ArrayList<Expense> expenses = new ArrayList<Expense>();
        Cruise cruise = new Cruise(dest);
        expenses.add(cruise);
        float cost = tallyExpenses(expenses);
        return cost;

    }

    /**
     * An internal method used by VacationCalculator to loop through
     * a List of items that implement the Expense interface and
     * determine their cost
     *
     * @param  expenses A list of items that implement the Expense interface
     * @return          the total cost calculated by the items
     */
    float tallyExpenses(List<Expense> expenses) {
        float totalExpenses = 0;
        for( Expense e: expenses) {
            totalExpenses += e.getCost();
        }
        return totalExpenses;
    }
}
