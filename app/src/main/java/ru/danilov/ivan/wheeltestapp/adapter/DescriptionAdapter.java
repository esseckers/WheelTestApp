package ru.danilov.ivan.wheeltestapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ru.danilov.ivan.wheeltestapp.R;
import ru.danilov.ivan.wheeltestapp.model.MediaItem;

/**
 * Created by Ivan Danilov on 05.06.2016.
 * Email: esseckers@gmail.com
 */
public class DescriptionAdapter extends RecyclerView.Adapter<DescriptionAdapter.ViewHolder>{

    private List<MediaItem> itemList;

    public void setItemList(List<MediaItem> itemList) {
        this.itemList = itemList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_desc, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        MediaItem item = itemList.get(i);
        viewHolder.icon.setBackgroundResource(item.getImgRes());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView icon;

        public ViewHolder(View itemView) {
            super(itemView);
            icon = (ImageView) itemView.findViewById(R.id.imgDesc);
        }
    }
}
