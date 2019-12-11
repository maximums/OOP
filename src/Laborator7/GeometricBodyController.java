package Laborator7;

import java.util.List;

public class GeometricBodyController {

    float returnBiggestVolume(List<IGeometricBody> geometricBodies){
        float maximumVolume = geometricBodies.get(0).getVolume();
        for(int i = 0; i < geometricBodies.size(); i++)
            if(geometricBodies.get(i).getVolume() > maximumVolume)
                maximumVolume = geometricBodies.get(i).getVolume();
        return maximumVolume;
    }

    float returnBiggestSurface(List<IGeometricBody> geometricBodies){
        float maximumSurface = geometricBodies.get(0).getSurface();
        for(int i = 0; i < geometricBodies.size(); i++)
            if(geometricBodies.get(i).getSurface() > maximumSurface)
                maximumSurface = geometricBodies.get(i).getSurface();
         return maximumSurface;
    }
}
