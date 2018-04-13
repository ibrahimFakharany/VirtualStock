package virtualstock.app.com.virtualstock.UI.Home;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;

import virtualstock.app.com.virtualstock.R;

/**
 * Created by 450 G1 on 12/04/2018.
 */

public class ChartsViewPagerAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    public ChartsViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_chart_slider, null);
        BarChart barChart = view.findViewById(R.id.chart_item);


        return view;
    }
}
