package regelmotor.barneforsikring;

import static regelmotor.diagnose.Diagnose.*;
import static regelmotor.diagnose.VurderingMedInvaliditet.*;
import static regelmotor.diagnose.VurderingUforhet.*;
import regelmotor.core.*;

public class AstmaLuftsveiLidelser extends AbstractVurdering {

   private final static Object[][] REGEL_OPPSETT = {
      {J45_ASTMA_SIKKER_DIAGNOSE, R9, R9_SOM_REGEL},
      {J45_ASTMA_IKKE_SIKKER_DIAGNOSE, R11, ORDINARE_VILKAAR},
      {B97_RS_VIRUS_TILSTEDE_VED_TEGNING, R11, ORDINARE_VILKAAR},
   };
   
   public AstmaLuftsveiLidelser() {
	   super(REGEL_OPPSETT);
   }
}
