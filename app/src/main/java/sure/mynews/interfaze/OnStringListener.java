package sure.mynews.interfaze;

/**
 * Created by dell88 on 2017/3/9 0009.
 */
import com.android.volley.Request;
import com.android.volley.VolleyError;

public interface OnStringListener {
    /**
     * 请求成功时回调
     */
    void onSuccess(String result);

    /**
     * 请求失败时回调
     */
    void onError(VolleyError error);
}
