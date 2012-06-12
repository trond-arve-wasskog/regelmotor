package regelmotor.diagnose;

public enum VurderingUforhet {
   ORDINARE_VILKAAR(true),
   RESERVASJON_KUN_I_ALVORLIGE_TILFELLER(false);
   
   private final boolean kanAutomatiseres;

   private VurderingUforhet(boolean kanAutomatiseres) {
      this.kanAutomatiseres = kanAutomatiseres;
   }
   
   boolean kanAutomatiseres() {
      return kanAutomatiseres;
   }
   
}
