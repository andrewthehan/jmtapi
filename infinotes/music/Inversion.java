
package infinotes.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Inversion{
	ROOT,
	FIRST,
	SECOND,
	THIRD;
	
	private static final List<Inversion> VALUES = new ArrayList<Inversion>(Arrays.asList(Inversion.values()));
	
	private static final Map<Inversion, String> TO_STRING_MAP = new HashMap<Inversion, String>();
	
	static{
		TO_STRING_MAP.put(ROOT, "");
		TO_STRING_MAP.put(FIRST, "^");
		TO_STRING_MAP.put(SECOND, "^^");
		TO_STRING_MAP.put(THIRD, "^^^");
	}
	
	public int getValue(){
		return VALUES.indexOf(this);
	}
	
	@Override
	public String toString(){
		return TO_STRING_MAP.get(this);
	}
}