package ru.danilov.ivan.wheeltestapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import kankan.wheel.widget.adapters.AbstractWheelAdapter;
import ru.danilov.ivan.wheeltestapp.R;
import ru.danilov.ivan.wheeltestapp.model.MediaItem;

/**
 * Created by Ivan Danilov on 05.06.2016.
 * Email: esseckers@gmail.com
 */
public class WheelAdapter extends AbstractWheelAdapter {

    private List<MediaItem> mediaItems;

    private Context context;
    private int currentItem;

    /**
     * Constructor
     */
    public WheelAdapter(Context context) {
        this.context = context;
    }

    public void setMediaItems(List<MediaItem> mediaItems) {
        this.mediaItems = mediaItems;
    }

    public void setCurrentItem(int currentItem) {
        this.currentItem = currentItem;
        notifyDataChangedEvent();
    }

    @Override
    public int getItemsCount() {
        return mediaItems.size();
    }

    @Override
    public View getItem(int index, View cachedView, ViewGroup parent) {
        FrameLayout container;
        MediaItem item = mediaItems.get(index);

        if (currentItem == index) {
            container = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.current_item_media, parent, false);
        } else {
            container = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.item_media, parent, false);
        }
        TextView genre = (TextView) container.findViewById(R.id.genre);
        ImageView imgUrl = (ImageView) container.findViewById(R.id.imgUrl);
        imgUrl.setImageResource(item.getImgRes());
        genre.setText(item.getGenre());
        return container;
    }
}

