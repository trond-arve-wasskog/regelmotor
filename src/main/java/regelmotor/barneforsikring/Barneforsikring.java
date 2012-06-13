package regelmotor.barneforsikring;

import java.util.*;

import regelmotor.core.*;
import regelmotor.diagnose.*;
import regelmotor.soker.*;

public class Barneforsikring implements Vurdering {

	private final Set<Vurdering> barneforsikringsregler = new HashSet<Vurdering>();
	
	public Barneforsikring() {
		barneforsikringsregler.add(new AllergiskeLidelser());
		barneforsikringsregler.add(new AstmaLuftsveiLidelser());
	}
	
	public Set<VurderingMedInvaliditet> vurderingMedInvaliditet(Soker soker) {
		Set<VurderingMedInvaliditet> vurderingMedInvaliditet = new HashSet<VurderingMedInvaliditet>();
		for (Vurdering vurdering : barneforsikringsregler) {
			vurderingMedInvaliditet.addAll(vurdering.vurderingMedInvaliditet(soker));
		}
		
		return Collections.unmodifiableSet(vurderingMedInvaliditet);
	}

}
