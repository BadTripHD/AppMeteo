package Adapters;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.td4.Prevision;
import com.example.td4.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private List<Prevision> dataModelList;

    public RecyclerViewAdapter (List<Prevision> dataModelList) { this.dataModelList = dataModelList;}

    @NonNull
    @Override
    public  RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_item, parent,false);
        viewHolder = new RecyclerViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position){
        //holder.tvDate.setTypeface(null, Typeface.BOLD);
        holder.tvDate.setText(Html.fromHtml("Date : " + String.valueOf(dataModelList.get(position).formatDate())));
        holder.tvTemp.setText(Html.fromHtml("Température : <b>" + String.valueOf(Integer.toString(Math.round(dataModelList.get(position).getMain().getTemp())) + "°C</b>")));

        switch (dataModelList.get(position).getWeather().get(0).getMain()) {
            case "Rain":
                holder.ivImg.setImageResource(R.drawable.ic_rain);
                break;

            case "Clouds":
                holder.ivImg.setImageResource(R.drawable.ic_clouds);
                break;

            case "Thunderstorm":
                holder.ivImg.setImageResource(R.drawable.ic_storm);
                break;

            case "Drizzle":
                holder.ivImg.setImageResource(R.drawable.ic_rain);
                break;

            case "Snow":
                holder.ivImg.setImageResource(R.drawable.ic_snowing);
                break;

                default:
                    holder.ivImg.setImageResource(R.drawable.ic_sunny);
        }
    }

    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount(){
        return  dataModelList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView ivImg;
        TextView tvDate;
        TextView tvTemp;
        LinearLayout LLItemView;

        public RecyclerViewHolder(@NonNull View itemView){
            super(itemView);
            LLItemView = itemView.findViewById(R.id.LLItemView);
            ivImg = itemView.findViewById(R.id.ivImg);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvTemp = itemView.findViewById(R.id.tvTemp);

        }
    }
}
