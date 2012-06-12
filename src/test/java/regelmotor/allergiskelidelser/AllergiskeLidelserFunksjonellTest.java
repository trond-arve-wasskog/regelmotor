package regelmotor.allergiskelidelser;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;
import static regelmotor.allergiskelidelser.TestDataHelper.sokerMed;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.Test;
import org.junit.runner.RunWith;

import regelmotor.diagnose.Diagnose;
import regelmotor.diagnose.VurderingMedInvaliditet;

@RunWith(Feeder.class)
public class AllergiskeLidelserFunksjonellTest {
   
   @Test
   @Source("AllergiskeLidelser.xls")
   public void testAllergiskeLidelser(Diagnose diagnose, VurderingMedInvaliditet vurderingMedInvaliditet) {
      AllergiskeLidelser allergiskeLidelser = new AllergiskeLidelser();
      assertThat(allergiskeLidelser.vurderingMedInvaliditet(sokerMed(diagnose)), hasItems(vurderingMedInvaliditet));
   }   
}
