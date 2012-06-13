package regelmotor.barneforsikring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import regelmotor.diagnose.Diagnose;

public class Soknad {
   
   private List<Diagnose> diagnoser = new ArrayList<Diagnose>();
   
   public static SoknadBuilder soknad() {
      return new SoknadBuilder();
   }
   
   public static class SoknadBuilder {
      private final Soknad soknad;
      public SoknadBuilder() {
         this.soknad = new Soknad();
      }

      public SoknadBuilder med(Diagnose... diagnoser) {
         soknad.diagnoser.addAll(Arrays.asList(diagnoser));
         return this;
      }
      
      public Soknad build() {
         return this.soknad;
      }
   }

   public boolean harDiagnose(Diagnose diagnose) {
      return diagnoser.contains(diagnose);
   }

   public Iterable<Diagnose> diagnoser() {
      return diagnoser;
   }

}
