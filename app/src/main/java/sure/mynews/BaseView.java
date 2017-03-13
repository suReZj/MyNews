package sure.mynews;

import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by dell88 on 2017/3/9 0009.
 */

public interface BaseView<T> {
    // 为View设置Presenter
    void setPresenter(T presenter);
    // 初始化界面控件
    void initViews(View view);
}
