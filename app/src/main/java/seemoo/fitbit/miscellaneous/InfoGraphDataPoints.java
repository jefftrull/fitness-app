package seemoo.fitbit.miscellaneous;

import com.jjoe64.graphview.series.DataPoint;

public class InfoGraphDataPoints extends InfoListItem {

    private DataPoint[] datapoints;

    public InfoGraphDataPoints(int itemType, DataPoint[] dataPoints) {
        super.setType(itemType);
        this.datapoints = dataPoints;
    }

    public DataPoint[] getDatapoints() {
        return datapoints;
    }

}
