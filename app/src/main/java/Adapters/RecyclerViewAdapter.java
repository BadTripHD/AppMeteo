package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        holder.tvId.setText(String.valueOf(dataModelList.get(position).getDt()));
    }

    public long getItemId(int position){
        return super.getItemId(position);
    }

    @Override
    public int getItemCount(){
        return  dataModelList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvId;
        TextView tvDate;
        TextView tvTableNumber;
        LinearLayout LLItemView;

        public RecyclerViewHolder(@NonNull View itemView){
            super(itemView);
            LLItemView = itemView.findViewById(R.id.LLItemView);
            tvId = itemView.findViewById(R.id.tvID);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvTableNumber = itemView.findViewById(R.id.tvTableNumber);
        }
    }
}
