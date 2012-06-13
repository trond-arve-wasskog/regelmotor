package regelmotor.core;

import java.util.*;

import regelmotor.barneforsikring.*;
import regelmotor.diagnose.*;

public interface Vurdering {
	Set<VurderingMedInvaliditet> vurderingMedInvaliditet(Soknad soknad);
}
