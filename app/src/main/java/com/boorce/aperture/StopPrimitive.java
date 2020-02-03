package com.boorce.aperture;

public class StopPrimitive {

    private double currentValue;
    private int stop=0;
    private int defaultPrecision=1;

    void StopPrimitve(double value) {
        defaultPrecision=1;
        currentValue=value;
    }

    public double getStartValue() {
        return currentValue;
    }

    protected String getValueAsString(double Value,int precision) {
        String workData;
        if(Value<1) {
            workData="1/"+Double.toString(Math.round(1/Value));
        } else {
            workData=Double.toString(Math.round(Value*Math.pow(10,precision))/Math.pow(10,precision));
        }
        return workData;
    }

    public String getStartValueString() {
        return getValueAsString(currentValue,defaultPrecision);
    }

    public int getStop() {
        return stop;
    }

    void setStop(int newStop) {
        stop=newStop;
    }

    public double getNewValue() {
        return currentValue/Math.pow(currentValue,stop);
    }

    public double getNewValue( int newStop ) {
        this.setStop(newStop);
        return this.getNewValue();
    }

    public String getNewValueString() {
        return getValueAsString(this.getNewValue(),defaultPrecision);
    }

    /* To Do : get en String, ajouter un arrondi sur getNewValue, faire un get New Value avec set stop en plus */


}
