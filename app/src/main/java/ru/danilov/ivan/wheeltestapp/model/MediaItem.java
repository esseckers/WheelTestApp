package ru.danilov.ivan.wheeltestapp.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Ivan Danilov on 05.06.2016.
 * Email: esseckers@gmail.com
 */
public class MediaItem implements Serializable {

    private String genre;
    private int imgRes;
    private List<MediaItem> mediaDescs;

    public MediaItem() {
    }

    public MediaItem(String genre, int imgRes) {
        this.genre = genre;
        this.imgRes = imgRes;
    }

    public MediaItem(String genre, int imgRes,  List<MediaItem> mediaDescs) {
        this.genre = genre;
        this.imgRes = imgRes;
        this.mediaDescs = mediaDescs;
    }

    public String getGenre() {
        return genre;
    }

    public int getImgRes() {
        return imgRes;
    }

    public List<MediaItem> getMediaDescs() {
        return mediaDescs;
    }

}
