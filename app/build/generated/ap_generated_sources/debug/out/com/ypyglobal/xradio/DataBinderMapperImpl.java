package com.ypyglobal.xradio;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ypyglobal.xradio.databinding.ActivityAppBarMainBindingImpl;
import com.ypyglobal.xradio.databinding.ActivityGrantPermissionBindingImpl;
import com.ypyglobal.xradio.databinding.ActivityShowUrlBindingImpl;
import com.ypyglobal.xradio.databinding.ActivitySingleRadioBindingImpl;
import com.ypyglobal.xradio.databinding.ActivitySplashBindingImpl;
import com.ypyglobal.xradio.databinding.FragmentDragDropDetailBindingImpl;
import com.ypyglobal.xradio.databinding.FragmentRecyclerviewBindingImpl;
import com.ypyglobal.xradio.databinding.ItemFooterBindingImpl;
import com.ypyglobal.xradio.databinding.ItemSingleRadioDetailBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAPPBARMAIN = 1;

  private static final int LAYOUT_ACTIVITYGRANTPERMISSION = 2;

  private static final int LAYOUT_ACTIVITYSHOWURL = 3;

  private static final int LAYOUT_ACTIVITYSINGLERADIO = 4;

  private static final int LAYOUT_ACTIVITYSPLASH = 5;

  private static final int LAYOUT_FRAGMENTDRAGDROPDETAIL = 6;

  private static final int LAYOUT_FRAGMENTRECYCLERVIEW = 7;

  private static final int LAYOUT_ITEMFOOTER = 8;

  private static final int LAYOUT_ITEMSINGLERADIODETAIL = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.activity_app_bar_main, LAYOUT_ACTIVITYAPPBARMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.activity_grant_permission, LAYOUT_ACTIVITYGRANTPERMISSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.activity_show_url, LAYOUT_ACTIVITYSHOWURL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.activity_single_radio, LAYOUT_ACTIVITYSINGLERADIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.fragment_drag_drop_detail, LAYOUT_FRAGMENTDRAGDROPDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.fragment_recyclerview, LAYOUT_FRAGMENTRECYCLERVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.item_footer, LAYOUT_ITEMFOOTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ypyglobal.xradio.R.layout.item_single_radio_detail, LAYOUT_ITEMSINGLERADIODETAIL);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAPPBARMAIN: {
          if ("layout/activity_app_bar_main_0".equals(tag)) {
            return new ActivityAppBarMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_app_bar_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYGRANTPERMISSION: {
          if ("layout/activity_grant_permission_0".equals(tag)) {
            return new ActivityGrantPermissionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_grant_permission is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSHOWURL: {
          if ("layout/activity_show_url_0".equals(tag)) {
            return new ActivityShowUrlBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_show_url is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSINGLERADIO: {
          if ("layout/activity_single_radio_0".equals(tag)) {
            return new ActivitySingleRadioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_single_radio is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRAGDROPDETAIL: {
          if ("layout/fragment_drag_drop_detail_0".equals(tag)) {
            return new FragmentDragDropDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_drag_drop_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRECYCLERVIEW: {
          if ("layout/fragment_recyclerview_0".equals(tag)) {
            return new FragmentRecyclerviewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_recyclerview is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMFOOTER: {
          if ("layout/item_footer_0".equals(tag)) {
            return new ItemFooterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_footer is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSINGLERADIODETAIL: {
          if ("layout/item_single_radio_detail_0".equals(tag)) {
            return new ItemSingleRadioDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_single_radio_detail is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_app_bar_main_0", com.ypyglobal.xradio.R.layout.activity_app_bar_main);
      sKeys.put("layout/activity_grant_permission_0", com.ypyglobal.xradio.R.layout.activity_grant_permission);
      sKeys.put("layout/activity_show_url_0", com.ypyglobal.xradio.R.layout.activity_show_url);
      sKeys.put("layout/activity_single_radio_0", com.ypyglobal.xradio.R.layout.activity_single_radio);
      sKeys.put("layout/activity_splash_0", com.ypyglobal.xradio.R.layout.activity_splash);
      sKeys.put("layout/fragment_drag_drop_detail_0", com.ypyglobal.xradio.R.layout.fragment_drag_drop_detail);
      sKeys.put("layout/fragment_recyclerview_0", com.ypyglobal.xradio.R.layout.fragment_recyclerview);
      sKeys.put("layout/item_footer_0", com.ypyglobal.xradio.R.layout.item_footer);
      sKeys.put("layout/item_single_radio_detail_0", com.ypyglobal.xradio.R.layout.item_single_radio_detail);
    }
  }
}
