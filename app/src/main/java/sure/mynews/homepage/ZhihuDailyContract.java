package sure.mynews.homepage;

import com.marktony.zhihudaily.BasePresenter;
import com.marktony.zhihudaily.BaseView;
import com.marktony.zhihudaily.bean.ZhihuDailyNews;

import java.util.ArrayList;

import sure.mynews.BasePresenter;
import sure.mynews.BaseView;
import sure.mynews.bean.ZhihuDailyNews;

/**
 * Created by Lizhaotailang on 2016/9/16.
 */

public interface ZhihuDailyContract {

    interface View extends BaseView<Presenter> {

        void showError();

        void showLoading();

        void stopLoading();

        void showResults(ArrayList<ZhihuDailyNews.Question> list);

    }

    interface Presenter extends BasePresenter {

        void loadPosts(long date, boolean clearing);

        void refresh();

        void loadMore(long date);

        void startReading(int position);

        void feelLucky();

    }

}
