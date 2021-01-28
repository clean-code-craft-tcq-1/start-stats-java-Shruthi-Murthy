package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{   

	public static Stats getStatistics(final List<Float> numbers) {
		Stats stats = new Stats();
		if(numbers.isEmpty()||numbers.size()==0)
		{
			stats.setAverage(Float.NaN);
			stats.setMin(Float.NaN);
			stats.setMax(Float.NaN);
		}
		Collections.sort(numbers);
		stats.setMin(numbers.get(0));
		stats.setMax(numbers.get(numbers.size()-1));
		return stats;
    }
}
