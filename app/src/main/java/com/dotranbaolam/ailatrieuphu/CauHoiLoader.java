package com.dotranbaolam.ailatrieuphu;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class CauHoiLoader extends AsyncTaskLoader<String> {

    private final int id;

    public CauHoiLoader(@NonNull Context context, int id)
    {
        super(context);
        this.id = id-1;
    }

    @Override
    protected void onStartLoading()
    {
        super.onStartLoading();
        forceLoad();
    }

    @Nullable
    @Override
    public String loadInBackground()
    {
        return NetworkUtils.getJSONData("cau-hoi?linh_vuc="+id,"GET");
    }
}
