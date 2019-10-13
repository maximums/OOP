package Laborator2;

public class Box {
    private int height;
    private int width;
    private int depth;

    Box(){
        height = 1;
        width = 1;
        depth = 1;
    }

    Box(int value){
        height = value;
        width = value;
        depth = value;
    }

    Box(int height , int width , int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    int getSurface(){
        return height * depth * 2 + height * width * 2 + depth * width * 2;
    }
    int getVolume(){
        return height * depth * width;
    }
}
