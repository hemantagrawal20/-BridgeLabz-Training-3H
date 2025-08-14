// Program to compute the volume of Earth in km^3 and miles^3
public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.1415926535;

        double volumeKm3 = (4.0/3) * pi * Math.pow(radiusKm, 3);
        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0/3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}
