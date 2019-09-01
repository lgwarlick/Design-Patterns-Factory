public class Barracks {

    /**
     * Factory for BioUnit objects, fully encapsulates the object creation
     * @param requestedUnit the user input for unit type
     * @return the type of unit the user has requested
     */


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
