public class HomeWorkYevych {
    public static void main(String[] args) {
        // Adding a new comment
        /**
         *  F -> C
         *  F -> K
         *
         *  C -> F
         *  C -> K
         *
         *  K -> F
         *  K -> C
         */

        // F -> C

        double fTemp = 100;
        double cTemp_fTemp = (fTemp - 32) * 5/9;
        System.out.println(fTemp+"°F is equals to "+cTemp_fTemp+"°C");

        // F -> K

        double fTemp_kTemp = (fTemp - 459.67) * 5/9;
        System.out.println(fTemp+"°F is equals to "+fTemp_kTemp+"°K");

        // C -> F

        double cTemp = 100;
        double fTemp_cTemp = cTemp * 9/5 + 32;
        System.out.println(fTemp+"°C is equals to "+fTemp_cTemp+"°F");

        // C -> K

        double cTemp_kTemp = cTemp + 273.15;
        System.out.println(fTemp+"°C is equals to "+cTemp_kTemp+"°K");

        // K -> F

        double kTemp = 100;

        double kTemp_fTemp = kTemp *  9/5 - 459.67;
        System.out.println(fTemp+"°K is equals to "+kTemp_fTemp+"°F");

        // K -> C

        double kTemp_cTemp = kTemp - 273.15;
        System.out.println(fTemp+"°K is equals to "+kTemp_cTemp+"°C");



    }

}
