package plugin.qualifier.weaponprof;

import pcgen.cdom.reference.SelectionCreator;
import pcgen.rules.context.LoadContext;
import pcgen.core.WeaponProf;

public class TokenDTO {
    LoadContext context;
    SelectionCreator<WeaponProf> sc;
    String condition;
    String value;
    boolean negate;
}
