package regelmotor.barneforsikring;

import regelmotor.diagnose.Diagnose;
import regelmotor.soker.Soker;

public class TestDataHelper {

   public static Soker sokerMedT78() {
      return Soker.soker().med(Diagnose.T78).build();
   }

   public static Soker sokerMedK92() {
      return Soker.soker().med(Diagnose.K92).build();
   }

   public static Soker sokerMed(Diagnose... diagnose) {
      return Soker.soker().med(diagnose).build();
   }
   
}
