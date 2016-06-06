package ru.danilov.ivan.wheeltestapp.utils;

import java.util.ArrayList;
import java.util.List;

import ru.danilov.ivan.wheeltestapp.R;
import ru.danilov.ivan.wheeltestapp.model.MediaItem;

/**
 * Created by Ivan Danilov on 05.06.2016.
 * Email: esseckers@gmail.com
 */
public class MockData {

    public static List<MediaItem> generateData() {
        List<MediaItem> internalList1 = new ArrayList<MediaItem>();
        List<MediaItem> internalList2 = new ArrayList<MediaItem>();
        List<MediaItem> internalList3 = new ArrayList<MediaItem>();

        List<MediaItem> externalList = new ArrayList<MediaItem>();
        internalList1.add(new MediaItem("Ужасы", R.drawable.big_photo_1));
        internalList1.add(new MediaItem("Боевики", R.drawable.big_photo_2));
        internalList1.add(new MediaItem("Драмы", R.drawable.big_photo_3));

        internalList2.add(new MediaItem("Драмы", R.drawable.big_photo_3));
        internalList2.add(new MediaItem("Драмы", R.drawable.big_photo_3));

        internalList3.add(new MediaItem("Драмы", R.drawable.big_photo_3));
        internalList3.add(new MediaItem("Драмы", R.drawable.big_photo_3));
        internalList3.add(new MediaItem("Драмы", R.drawable.big_photo_3));
        internalList3.add(new MediaItem("Драмы", R.drawable.big_photo_3));
        internalList3.add(new MediaItem("Драмы", R.drawable.big_photo_3));

        externalList.add(new MediaItem("Приключения", R.drawable.photo_1, internalList1));
        externalList.add(new MediaItem("Триллер", R.drawable.photo_2, internalList2));
        externalList.add(new MediaItem("Фэнтази", R.drawable.photo_3, internalList1));
        externalList.add(new MediaItem("Фэнтази", R.drawable.photo_1, internalList3));
        externalList.add(new MediaItem("Фэнтази", R.drawable.photo_2, internalList3));
        externalList.add(new MediaItem("Триллер", R.drawable.photo_2, internalList2));
        externalList.add(new MediaItem("Фэнтази", R.drawable.photo_3, internalList1));
        externalList.add(new MediaItem("Фэнтази", R.drawable.photo_1, internalList3));
        externalList.add(new MediaItem("Фэнтази", R.drawable.photo_2, internalList3));

        return externalList;
    }
}
