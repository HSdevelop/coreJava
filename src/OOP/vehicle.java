/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author HS
 */
public class vehicle {
    private int height;
    private int width;
    private int weight;
    private String color;
    private int yearOfIssue;
    private String EngineType;

    public vehicle(int height, int width, int weight, String color, int yearOfIssue, String EngineType) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.EngineType = EngineType;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the yearOfIssue
     */
    public int getYearOfIssue() {
        return yearOfIssue;
    }

    /**
     * @param yearOfIssue the yearOfIssue to set
     */
    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    /**
     * @return the EngineType
     */
    public String getEngineType() {
        return EngineType;
    }

    /**
     * @param EngineType the EngineType to set
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    
    
    
}
