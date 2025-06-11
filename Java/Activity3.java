package activities;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercuryMult = 0.2408467;
        double VenusMult = 0.61519726;
        double MarsMult = 1.8808158;
        double JupiterMult = 11.862615;
        double SaturnMult = 29.447498;
        double UranusMult = 84.016846;
        double NeptuneMult = 164.79132;

        System.out.println("Age on Mercury: " + seconds/EarthSeconds/MercuryMult + " years");
        System.out.println("Age on Venus: " + seconds/EarthSeconds/VenusMult + " years");
        System.out.println("Age on Earth: " + seconds/EarthSeconds + " years");
        System.out.println("Age on Mars: " + seconds/EarthSeconds/MarsMult + " years");
        System.out.println("Age on Jupiter: " + seconds/EarthSeconds/JupiterMult + " years");
        System.out.println("Age on Saturn: " + seconds/EarthSeconds/SaturnMult + " years");
        System.out.println("Age on Uranus: " + seconds/EarthSeconds/UranusMult + " years");
        System.out.println("Age on Neptune: " + seconds/EarthSeconds/NeptuneMult + " years");
    }
}
