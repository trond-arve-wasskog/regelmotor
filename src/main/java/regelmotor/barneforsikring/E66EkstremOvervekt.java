package regelmotor.barneforsikring;

import java.util.*;

import regelmotor.core.*;
import regelmotor.diagnose.*;

public class E66EkstremOvervekt implements Vurdering {

	public E66EkstremOvervekt() {
	}

	public Set<VurderingMedInvaliditet> vurderingMedInvaliditet(Soknad soknad) {
		switch (soknad.getAlder()) {
		case 2:
			if(soknad.getVekt() > 21.2) return Collections.singleton(VurderingMedInvaliditet.AVSLAG);
			if(soknad.getVekt() > 19.4) return Collections.singleton(VurderingMedInvaliditet.RESERVASJON);
			break;
		case 3:
			if(soknad.getVekt() > 20.0) return Collections.singleton(VurderingMedInvaliditet.AVSLAG);
			if(soknad.getVekt() > 18.7) return Collections.singleton(VurderingMedInvaliditet.RESERVASJON);
			break;
		case 4:
			if(soknad.getVekt() > 19.6) return Collections.singleton(VurderingMedInvaliditet.AVSLAG);
			if(soknad.getVekt() > 18.4) return Collections.singleton(VurderingMedInvaliditet.RESERVASJON);
			break;
			
		}
		
		return Collections.emptySet();
	}
}
