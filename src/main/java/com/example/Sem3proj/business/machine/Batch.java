package com.example.Sem3proj.business.machine;

import com.example.Sem3proj.business.ReportWriter;

public class Batch {
    // Product specific
    private float batchID;
    private ProductType productType;
    // Batch specific
    private int amountToProduce;
    private int totalCurrentAmount;
    private int amountAcceptable;
    private int amountDefect;
    private int amountRemaining;
    // Resource specific
    private float amountBarley;
    private float amountMalt;
    private float amountHops;
    private float amountWheat;
    // Continuous variable specific
    private float curTemperature;
    private float curHumidity;
    private float curVibration;
    // Min
    private float minTemperature;
    private float minHumidity;
    private float minVibration;
    // Max
    private float maxTemperature;
    private float maxHumidity;
    private float maxVibration;

    public Batch(float batchID, ProductType productType, int amountToProduce) {
        this.batchID = batchID;
        this.productType = productType;
        this.amountToProduce = amountToProduce;
    }

    public void sendToGui(){
        // TODO send info to gui functionality
    }

    public double calAvgTemperature(){
        // TODO calculate average temperature
        return 0;
    }

    public double calAvgHumidity(){
        // TODO calculate average Humidity
        return 0;
    }

    public double calAvgVibration(){
        // TODO calculate average Humidity
        return 0d;
    }

    public double calOEE(){
        // OEE = A * P * Q
        // A = run time / planned run time
        // P = (ideal cycle time * total count) / Run time
        // Q = Good count / total count
        // TODO Decide whether to calculate full OEE, so far only "quality" is accounted for.
        return (double) (amountAcceptable / totalCurrentAmount);
    }

    public void WriteReport(){
        // TODO test if working
        ReportWriter.writeBatch(this);
    }

    // -------------------------------------------- [ Getter / Setter ] -------------------------------------------- //

    // -------- [ Getters only ] -------- //

    public float getBatchID() {
        return batchID;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getAmountToProduce() {
        return amountToProduce;
    }

    // -------- [ Getter & Setter ] -------- //


    public int getTotalCurrentAmount() {
        return totalCurrentAmount;
    }

    public void setTotalCurrentAmount(int totalCurrentAmount) {
        this.totalCurrentAmount = totalCurrentAmount;
    }

    public int getAmountAcceptable() {
        return amountAcceptable;
    }

    public void setAmountAcceptable(int amountAcceptable) {
        this.amountAcceptable = amountAcceptable;
    }

    public int getAmountDefect() {
        return amountDefect;
    }

    public void setAmountDefect(int amountDefect) {
        this.amountDefect = amountDefect;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public float getAmountBarley() {
        return amountBarley;
    }

    public void setAmountBarley(float amountBarley) {
        this.amountBarley = amountBarley;
    }

    public float getAmountMalt() {
        return amountMalt;
    }

    public void setAmountMalt(float amountMalt) {
        this.amountMalt = amountMalt;
    }

    public float getAmountHops() {
        return amountHops;
    }

    public void setAmountHops(float amountHops) {
        this.amountHops = amountHops;
    }

    public float getAmountWheat() {
        return amountWheat;
    }

    public void setAmountWheat(float amountWheat) {
        this.amountWheat = amountWheat;
    }

    public float getCurTemperature() {
        return curTemperature;
    }

    public void setCurTemperature(float curTemperature) {
        this.curTemperature = curTemperature;
    }

    public float getCurHumidity() {
        return curHumidity;
    }

    public void setCurHumidity(float curHumidity) {
        this.curHumidity = curHumidity;
    }

    public float getCurVibration() {
        return curVibration;
    }

    public void setCurVibration(float curVibration) {
        this.curVibration = curVibration;
    }

    public float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public float getMinHumidity() {
        return minHumidity;
    }

    public void setMinHumidity(float minHumidity) {
        this.minHumidity = minHumidity;
    }

    public float getMinVibration() {
        return minVibration;
    }

    public void setMinVibration(float minVibration) {
        this.minVibration = minVibration;
    }

    public float getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(float maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public float getMaxHumidity() {
        return maxHumidity;
    }

    public void setMaxHumidity(float maxHumidity) {
        this.maxHumidity = maxHumidity;
    }

    public float getMaxVibration() {
        return maxVibration;
    }

    public void setMaxVibration(float maxVibration) {
        this.maxVibration = maxVibration;
    }
}
