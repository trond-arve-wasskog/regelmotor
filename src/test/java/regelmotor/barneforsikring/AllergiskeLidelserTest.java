package regelmotor.barneforsikring;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static regelmotor.barneforsikring.TestDataHelper.*;
import static regelmotor.diagnose.Diagnose.*;
import static regelmotor.diagnose.VurderingMedInvaliditet.*;

import org.junit.*;

public class AllergiskeLidelserTest {
   
   private AllergiskeLidelser allergiskeLidelser;

   @Before
   public void settOppAllergiskeLidelserRegelsett() {
      allergiskeLidelser = new AllergiskeLidelser();
   }
   
   @Test
   public void testAtAllergierInklPollenallergiT78VurderingMedInvaliditetErR13AllergiskeLidelser() {
      assertThat(allergiskeLidelser.vurderingMedInvaliditet(sokerMed(T78)), hasItem(R13_ALLERGISKE_LIDELSER));
   }

   @Test
   public void testAtMatvareintoleranseK92VurderingMedInvaliditetErR13MatvareintoleranseAllergi() {
      assertThat(allergiskeLidelser.vurderingMedInvaliditet(sokerMed(K92)), hasItem(R13_MATVAREINTOLERANSE_ALLERGI));
   }
   
   @Test
   public void testAtToDiagnoserGirToVurderinger() {
      assertThat(allergiskeLidelser.vurderingMedInvaliditet(sokerMed(T78, K92)), hasItems(R13_ALLERGISKE_LIDELSER, R13_MATVAREINTOLERANSE_ALLERGI));
   }
   
}
