public class Barracks {

    public BioUnit makeBioUnit(String requestedUnit) {

        BioUnit barracksUnit = null;

        if (requestedUnit.equals("Marine")){
            return new Marine();
        } else

        if (requestedUnit.equals("Medic")){
            return new Medic();
        } else

        if (requestedUnit.equals("Firebat")){
            return new Firebat();
        } else return null;
    }


}
