package virtualstock.app.com.virtualstock.UI.Home;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import virtualstock.app.com.virtualstock.R;

/**
 * Created by 450 G1 on 12/04/2018.
 */

public class SliderViewPager extends PagerAdapter{
    Context context;
    ArrayList<New> news = new ArrayList<>();
    LayoutInflater layoutInflater;

    public SliderViewPager (ArrayList<New>  news, Context context){
        this.news = news;
        this.context = context;

    }

    @Override
    public int getCount() {
        return news.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_slider_layout,null);

        ImageView imageNew = view.findViewById(R.id.img_slider);
        TextView headerNew = view.findViewById(R.id.header_slider);



        ViewPager vp  =(ViewPager) container;
        vp.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
