package regelmotor.barneforsikring;

import regelmotor.diagnose.Diagnose;

public class TestDataHelper {

   public static Soknad soknadMedT78() {
      return Soknad.soknad().med(Diagnose.T78).build();
   }

   public static Soknad soknadMedK92() {
      return Soknad.soknad().med(Diagnose.K92).build();
   }

   public static Soknad soknadMed(Diagnose... diagnose) {
      return Soknad.soknad().med(diagnose).build();
   }
   
}
