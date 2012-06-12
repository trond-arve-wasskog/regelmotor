package regelmotor.core;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import regelmotor.diagnose.Diagnose;
import regelmotor.diagnose.VurderingMedInvaliditet;

public class RegelsettFactory {

   public static Map<Diagnose, VurderingMedInvaliditet> settOppRegler(Object[][] regelOppsett) {
      Map<Diagnose, VurderingMedInvaliditet> tempRegler = new HashMap<Diagnose, VurderingMedInvaliditet>();
      for (Object[] regel : regelOppsett) {
         tempRegler.put((Diagnose) regel[0], (VurderingMedInvaliditet)regel[1]);
      }
      
      return Collections.unmodifiableMap(tempRegler);
   }

}
