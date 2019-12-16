package me.samlss.lighter.interfaces;

import android.view.View;

/**
 * 版本编号: 1.0;
 * 创建作者: jinjian;
 * 创建时间: 2019-12-16 17:33;
 * 文件描述:
 */
public interface OnLighterViewInterceptClickListener {
    void onHighlightClick(View v);

    void onOutClick(View v);
}
