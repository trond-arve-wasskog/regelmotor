package regelmotor.soker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import regelmotor.diagnose.Diagnose;

public class Soker {
   
   private List<Diagnose> diagnoser = new ArrayList<Diagnose>();
   
   public static SokerBuilder soker() {
      return new SokerBuilder();
   }
   
   public static class SokerBuilder {
      private final Soker soker;
      public SokerBuilder() {
         this.soker = new Soker();
      }

      public SokerBuilder med(Diagnose[] diagnoser) {
         soker.diagnoser.addAll(Arrays.asList(diagnoser));
         return this;
      }
      
      public SokerBuilder med(Diagnose diagnose) {
         soker.diagnoser.add(diagnose);
         return this;
      }
      
      public Soker build() {
         return this.soker;
      }
   }

   public boolean harDiagnose(Diagnose diagnose) {
      return diagnoser.contains(diagnose);
   }

   public Iterable<Diagnose> diagnoser() {
      return diagnoser;
   }

}
