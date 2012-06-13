package regelmotor.core;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import regelmotor.diagnose.Diagnose;
import regelmotor.diagnose.VurderingMedInvaliditet;
import regelmotor.soker.Soker;

public abstract class AbstractVurdering implements Vurdering {

	private final Map<Diagnose, VurderingMedInvaliditet> regelsett;

	public AbstractVurdering(Object[][] regelOppsett) {
		regelsett = RegelsettFactory.settOppRegler(regelOppsett);
	}

	public Set<VurderingMedInvaliditet> vurderingMedInvaliditet(Soker soker) {
		Set<VurderingMedInvaliditet> vurderinger = new HashSet<VurderingMedInvaliditet>();
		for (Diagnose diagnose : soker.diagnoser()) {
			if (regelsett.containsKey(diagnose)) {
				vurderinger.add(regelsett.get(diagnose));
			}
		}

		return Collections.unmodifiableSet(vurderinger);
	}
}
