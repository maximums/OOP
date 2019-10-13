package Laborator1;

public class Monitor {
    private String color;
    private Float dimension;
    private Float resolution;

    public void setParameters(String color , Float dimension , Float resolution){
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }
    public String getColor(){
        return color;
    }

    public Float getDimension() {
        return dimension;
    }

    public Float getResolution() {
        return resolution;
    }
}
