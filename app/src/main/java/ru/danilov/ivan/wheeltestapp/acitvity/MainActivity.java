package ru.danilov.ivan.wheeltestapp.acitvity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.Bind;
import kankan.wheel.widget.OnWheelScrollListener;
import kankan.wheel.widget.WheelView;
import ru.danilov.ivan.wheeltestapp.R;
import ru.danilov.ivan.wheeltestapp.adapter.DescriptionAdapter;
import ru.danilov.ivan.wheeltestapp.adapter.WheelAdapter;
import ru.danilov.ivan.wheeltestapp.annotation.Layout;
import ru.danilov.ivan.wheeltestapp.model.MediaItem;
import ru.danilov.ivan.wheeltestapp.utils.MockData;

/**
 * Created by Ivan Danilov on 05.06.2016.
 * Email: esseckers@gmail.com
 */
@Layout(R.layout.activity_main)
public class MainActivity extends AbstractActivity {

    @Bind(R.id.genreWheel)
    WheelView rvGallery;

    @Bind(R.id.description)
    RecyclerView description;

    @Override
    protected void initView() {
        final List<MediaItem> items = MockData.generateData();
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        description.setLayoutManager(layoutManager);
        final WheelAdapter adapter = new WheelAdapter(this);
        final DescriptionAdapter descriptionAdapter = new DescriptionAdapter();
        descriptionAdapter.setItemList(items);
        adapter.setMediaItems(items);
        adapter.setCurrentItem(0);
        descriptionAdapter.setItemList(items.get(0).getMediaDescs());
        description.setAdapter(descriptionAdapter);
        rvGallery.setViewAdapter(adapter);
        rvGallery.addScrollingListener(new OnWheelScrollListener() {
            @Override
            public void onScrollingStarted(WheelView wheel) {
                adapter.setCurrentItem(-1);
            }

            @Override
            public void onScrollingFinished(WheelView wheel) {
                adapter.setCurrentItem(wheel.getCurrentItem());
                descriptionAdapter.setItemList(items.get(wheel.getCurrentItem()).getMediaDescs());
            }
        });
        rvGallery.setCyclic(true);
        rvGallery.setEnabled(true);
        rvGallery.setVertical(false);
    }
}
