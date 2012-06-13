package regelmotor.barneforsikring;

import static regelmotor.diagnose.Diagnose.*;
import static regelmotor.diagnose.VurderingMedInvaliditet.*;
import static regelmotor.diagnose.VurderingUforhet.*;
import regelmotor.core.*;

public class AllergiskeLidelser extends AbstractVurdering {

   private final static Object[][] REGEL_OPPSETT = {
      {T78, R13_ALLERGISKE_LIDELSER, RESERVASJON_KUN_I_ALVORLIGE_TILFELLER},
      {K92, R13_MATVAREINTOLERANSE_ALLERGI, ORDINARE_VILKAAR},
   };
   
   public AllergiskeLidelser() {
	   super(REGEL_OPPSETT);
   }
}
