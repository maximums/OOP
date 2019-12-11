package Laborator7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cub cub = new Cub();
        Sphere sphere = new Sphere();
        Parallelepiped parallelepiped = new Parallelepiped();
        List<IGeometricBody>  geometricBodies= new ArrayList<IGeometricBody>();
            geometricBodies.add(cub);
            geometricBodies.add(sphere);
            geometricBodies.add(parallelepiped);
        GeometricBodyController geometricBodyController = new GeometricBodyController();
        System.out.println(geometricBodyController.returnBiggestVolume(geometricBodies));
        System.out.println(geometricBodyController.returnBiggestSurface(geometricBodies));
    }
}
