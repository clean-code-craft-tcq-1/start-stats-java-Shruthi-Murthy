package statisticker;

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
		return stats;
    }
}
