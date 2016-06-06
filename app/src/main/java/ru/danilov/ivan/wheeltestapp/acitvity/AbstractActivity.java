package ru.danilov.ivan.wheeltestapp.acitvity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import ru.danilov.ivan.wheeltestapp.annotation.Layout;

/**
 * Created by Ivan Danilov on 05.06.2016.
 * Email: esseckers@gmail.com
 */
public abstract class AbstractActivity extends AppCompatActivity {

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewLayout());
        ButterKnife.bind(this);
        initView();
    }

    protected void initView() {
    }

    protected int getViewLayout() {
        Layout layout = this.getClass().getAnnotation(Layout.class);
        return layout != null ? layout.value() : 0;
    }
}
