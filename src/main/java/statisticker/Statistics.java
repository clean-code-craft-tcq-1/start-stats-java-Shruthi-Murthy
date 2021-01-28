package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{   

	public static Stats getStatistics(final List<Float> numbers) {
		Stats stats = new Stats();
		if(numbers.isEmpty())
		{
			stats.average(Float.NaN);
			stats.min(Float.NaN);
			stats.max(Float.NaN);
		}
		Collections.sort(numbers);
		stats.min(numbers.get(0));
		stats.max(numbers.get(numbers.size()-1));
		return stats;
    }
}
