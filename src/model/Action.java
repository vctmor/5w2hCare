package model;

import java.time.LocalDate;

public class Action {

    private int urgency;
    private int status;
    private double budget;
    private LocalDate starDate;
    private LocalDate endDate;

    public Action(int urgency, double budget, LocalDate starDate, LocalDate endDate, int status){
        
        this.urgency = urgency;
        this.status = status;
        this.budget = budget;
        this.starDate = starDate;
        this.endDate = endDate;
    }

    /**
     * @return int return the urgency
     */
    public int getUrgency() {
        return urgency;
    }

    /**
     * @param urgency the urgency to set
     */
    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    /**
     * @return int return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return double return the budget
     */
    public double getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(double budget) {
        this.budget = budget;
    }

    /**
     * @return LocalDate return the starDate
     */
    public LocalDate getStarDate() {
        return starDate;
    }

    /**
     * @param starDate the starDate to set
     */
    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
    }

    /**
     * @return LocalDate return the endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    
}
