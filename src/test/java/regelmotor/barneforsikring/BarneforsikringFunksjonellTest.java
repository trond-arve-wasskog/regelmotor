package regelmotor.barneforsikring;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;
import static regelmotor.barneforsikring.TestDataHelper.*;

import java.util.*;

import org.databene.benerator.anno.*;
import org.databene.feed4junit.*;
import org.junit.*;
import org.junit.runner.*;

import regelmotor.diagnose.*;

@RunWith(Feeder.class)
public class BarneforsikringFunksjonellTest {
   
	@Test
	@Source("BarneforsikringFunksjonellTest.xls")
	public void testBarneforsikring(Diagnose diagnose, VurderingMedInvaliditet vurderingMedInvaliditet, boolean kreverSaksbehandling) {
		Barneforsikring barneforsikring = new Barneforsikring();
		Set<VurderingMedInvaliditet> vurdering = barneforsikring.vurderingMedInvaliditet(soknadMed(diagnose));
		assertThat(vurdering, hasItem(vurderingMedInvaliditet));
		assertEquals(kreverSaksbehandling, vurdering.iterator().next().kreverSaksbehandling());
	}
}
