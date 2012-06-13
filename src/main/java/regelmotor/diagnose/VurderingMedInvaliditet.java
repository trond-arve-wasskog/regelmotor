package regelmotor.diagnose;

public enum VurderingMedInvaliditet {
   R13_ALLERGISKE_LIDELSER(true), 
   R13_MATVAREINTOLERANSE_ALLERGI(true),
   R13_LEGEMIDDELINTOLERANSE(false),
   R9(false),
   R11(false);
   
   private final boolean kreverSaksbehandling;

   private VurderingMedInvaliditet(boolean kreverSaksbehandling) {
      this.kreverSaksbehandling = kreverSaksbehandling;
   }
   
   public boolean kreverSaksbehandling() {
      return kreverSaksbehandling;
   }
}
