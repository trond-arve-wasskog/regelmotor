package regelmotor.allergiskelidelser;

import static regelmotor.diagnose.Diagnose.*;
import static regelmotor.diagnose.VurderingMedInvaliditet.*;
import static regelmotor.diagnose.VurderingUforhet.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import regelmotor.core.RegelsettFactory;
import regelmotor.diagnose.Diagnose;
import regelmotor.diagnose.VurderingMedInvaliditet;
import regelmotor.soker.Soker;

public class AllergiskeLidelser {

   private final static Object[][] REGEL_OPPSETT = {
      {T78, R13_ALLERGISKE_LIDELSER, RESERVASJON_KUN_I_ALVORLIGE_TILFELLER},
      {K92, R13_MATVAREINTOLERANSE_ALLERGI, ORDINARE_VILKAAR},
   };
   
   private final static Map<Diagnose, VurderingMedInvaliditet> REGLER = RegelsettFactory.settOppRegler(REGEL_OPPSETT);

   public AllergiskeLidelser() {
   }

   public Set<VurderingMedInvaliditet> vurderingMedInvaliditet(Soker soker) {
      Set<VurderingMedInvaliditet> vurderinger = new HashSet<VurderingMedInvaliditet>();
      for (Diagnose diagnose : soker.diagnoser()) {
         if(REGLER.containsKey(diagnose)) {
            vurderinger.add(REGLER.get(diagnose));
         }
      }
      
      return Collections.unmodifiableSet(vurderinger);

   }
}
