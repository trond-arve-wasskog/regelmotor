package regelmotor.barneforsikring;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static regelmotor.barneforsikring.TestDataHelper.*;

import org.databene.benerator.anno.*;
import org.databene.feed4junit.*;
import org.junit.*;
import org.junit.runner.*;

import regelmotor.diagnose.*;

@RunWith(Feeder.class)
public class BarneforsikringFunksjonellTest {
   
	@Test
	@Source("BarneforsikringFunksjonellTest.xls")
	public void testBarneforsikring(Diagnose diagnose, VurderingMedInvaliditet vurderingMedInvaliditet) {
		Barneforsikring barneforsikring = new Barneforsikring(); 
		assertThat(barneforsikring.vurderingMedInvaliditet(sokerMed(diagnose)), hasItems(vurderingMedInvaliditet));
	}
}
