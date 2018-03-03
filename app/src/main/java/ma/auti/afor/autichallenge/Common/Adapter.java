package ma.auti.afor.autichallenge.Common;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ma.auti.afor.autichallenge.R;
import ma.auti.afor.autichallenge.Score;

/**
 * Created by DELL on 19/01/2018.
 */

public class Adapter extends BaseAdapter {

    private Context context;
    private List<Score> lstScore;

    public Adapter(Context context, List<Score> lstRanking) {
        this.context = context;
        this.lstScore = lstRanking;
    }

    @Override
    public int getCount() {
        return lstScore.size();
    }

    @Override
    public Object getItem(int position) {
        return lstScore.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.row,null);

        ImageView imgTop = (ImageView)view.findViewById(R.id.imgTop);
        TextView txtTop = (TextView)view.findViewById(R.id.txtTop);

        if(position == 0 )// top1
            imgTop.setImageResource(R.drawable.top1);
        else if(position == 1) // top 2
            imgTop.setImageResource(R.drawable.top2);
        else
            imgTop.setImageResource(R.drawable.top3);

        txtTop.setText(String.format("%.1f",lstScore.get(position).getScore()));
        return view;

    }
}
