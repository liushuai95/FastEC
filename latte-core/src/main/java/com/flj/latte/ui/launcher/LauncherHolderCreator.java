package com.flj.latte.ui.launcher;

import android.view.View;

import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;

public class LauncherHolderCreator implements CBViewHolderCreator {

    @Override
    public LauncherHolder createHolder() {
        return new LauncherHolder();
    }
}
