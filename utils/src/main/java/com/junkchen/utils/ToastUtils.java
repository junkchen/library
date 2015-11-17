package com.junkchen.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by JunkChen on 2015/10/1 0011.
 * ToastUtils is for show toast.
 */
public class ToastUtils {

    /**
     * Show a standard toast that just contains a text view.
     *
     * @param context The context to use.
     * @param text    The text to show.
     */
    public static Toast showToast(Context context, String text) {
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
        return toast;
    }

    /**
     * Show a standard toast that just contains a text view with the text from a resource.
     *
     * @param context The context to use.
     * @param resId   The resource id of the string resource to use.  Can be formatted text.
     */
    public static Toast showToast(Context context, int resId) {
        Toast toast = Toast.makeText(context, resId, Toast.LENGTH_SHORT);
        toast.show();
        return toast;
    }

    /**
     * Show a standard toast that just contains a text view.
     *
     * @param context The context to use.
     * @param text    The text to show.
     * @param gravity Set the location at which the notification should appear on the screen.
     *                eg: Gravity.TOP, BOTTOM, LEFT, RIGHT etc.
     * @see android.view.Gravity
     */
    public static void showToast(Context context, String text, int gravity) {
        showToast(context, text).setGravity(gravity, 0, 0);
    }

    /**
     * Show a standard toast that just contains a text view with the text from a resource.
     *
     * @param context The context to use.
     * @param resId   The resource id of the string resource to use. Can be formatted text.
     * @param gravity Set the location at which the notification should appear on the screen.
     *                eg: Gravity.TOP, BOTTOM, LEFT, RIGHT etc.
     * @see android.view.Gravity
     */
    public static void showToast(Context context, int resId, int gravity) {
        showToast(context, resId).setGravity(gravity, 0, 0);
    }
}
