package com.company.Lab3.Assignment4;

import com.company.Lab3.Assignment2.ProductionWorker;
import java.util.Date;

public class TeamLeader extends ProductionWorker {
    private double monthlyBonusAmount;
    private double trainingHours;

    public TeamLeader(String name, Date hireDate, int shift, double hourlyPayRate, double monthlyBonusAmount, double trainingHours) {
        super(name, hireDate, shift, hourlyPayRate);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.trainingHours = trainingHours;
    }

    public TeamLeader(String name, int shift, double hourlyPayRate, double monthlyBonusAmount, double trainingHours) {
        super(name, shift, hourlyPayRate);
        this.monthlyBonusAmount = monthlyBonusAmount;
        this.trainingHours = trainingHours;
    }

    public double getMonthlyBonusAmount() {
        return monthlyBonusAmount;
    }

    public void setMonthlyBonusAmount(double monthlyBonusAmount) {
        this.monthlyBonusAmount = monthlyBonusAmount;
    }

    public double getTrainingHours() {
        return trainingHours;
    }

    public void setTrainingHours(double trainingHours) {
        this.trainingHours = trainingHours;
    }

    @Override
    public String toString() {
        return "TeamLeader{"+super.toString()+
                "monthlyBonusAmount=" + monthlyBonusAmount +
                ", trainingHours=" + trainingHours +
                '}';
    }
}
