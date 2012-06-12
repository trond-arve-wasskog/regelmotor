package regelmotor.diagnose;

public enum VurderingMedInvaliditet {
   R13_ALLERGISKE_LIDELSER(false), 
   R13_MATVAREINTOLERANSE_ALLERGI(false),
   R13_LEGEMIDDELINTOLERANSE(true);
   
   private final boolean kanAutomatiseres;

   private VurderingMedInvaliditet(boolean kanAutomatiseres) {
      this.kanAutomatiseres = kanAutomatiseres;
   }
   
   boolean kanAutomatiseres() {
      return kanAutomatiseres;
   }
}
