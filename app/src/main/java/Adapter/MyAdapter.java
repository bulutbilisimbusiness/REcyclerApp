package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bulutbilisimbusiness.recyclerapp.R;

import java.util.List;

import Model.ListItem;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<ListItem> listItems;
    public MyAdapter(Context context, List listitem){
        this.context=context;
        this.listItems=listitem;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        ListItem item = listItems.get(position);
        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public TextView description;
        public ViewHolder(View itemView) {
            super(itemView);

            name=(TextView) itemView.findViewById(R.id.title);
            description=(TextView) itemView.findViewById(R.id.description);
        }
    }
}
