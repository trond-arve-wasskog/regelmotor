package regelmotor.core;

import java.util.*;

import regelmotor.diagnose.*;
import regelmotor.soker.*;

public interface Vurdering {
	Set<VurderingMedInvaliditet> vurderingMedInvaliditet(Soker soker);
}
