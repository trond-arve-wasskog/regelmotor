package regelmotor.diagnose;

public enum VurderingUforhet {
   ORDINARE_VILKAAR(false),
   RESERVASJON_KUN_I_ALVORLIGE_TILFELLER(true),
   R9_SOM_REGEL(true);
   
   private final boolean kreverSaksbehandling;

   private VurderingUforhet(boolean kreverSaksbehandling) {
      this.kreverSaksbehandling = kreverSaksbehandling;
   }
   
   boolean kreverSaksbehandling() {
      return kreverSaksbehandling;
   }
   
}
