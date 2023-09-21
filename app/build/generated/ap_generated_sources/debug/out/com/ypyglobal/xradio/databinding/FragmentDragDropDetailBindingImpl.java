package com.ypyglobal.xradio.databinding;
import com.ypyglobal.xradio.R;
import com.ypyglobal.xradio.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDragDropDetailBindingImpl extends FragmentDragDropDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_bg_drag_drop, 1);
        sViewsWithIds.put(R.id.img_overlay, 2);
        sViewsWithIds.put(R.id.layout_action_bar_player, 3);
        sViewsWithIds.put(R.id.btn_close, 4);
        sViewsWithIds.put(R.id.tv_title_drag_drop, 5);
        sViewsWithIds.put(R.id.tv_bitrate, 6);
        sViewsWithIds.put(R.id.layout_img, 7);
        sViewsWithIds.put(R.id.tv_sleep_timer, 8);
        sViewsWithIds.put(R.id.img_play_song, 9);
        sViewsWithIds.put(R.id.equalizer, 10);
        sViewsWithIds.put(R.id.layout_info_play, 11);
        sViewsWithIds.put(R.id.tv_drag_song, 12);
        sViewsWithIds.put(R.id.tv_drag_singer, 13);
        sViewsWithIds.put(R.id.layout_action, 14);
        sViewsWithIds.put(R.id.layout_volume, 15);
        sViewsWithIds.put(R.id.seekBar1, 16);
        sViewsWithIds.put(R.id.img_volume_off, 17);
        sViewsWithIds.put(R.id.img_volume_max, 18);
        sViewsWithIds.put(R.id.layout_control, 19);
        sViewsWithIds.put(R.id.layout_content, 20);
        sViewsWithIds.put(R.id.fb_play, 21);
        sViewsWithIds.put(R.id.tv_percent, 22);
        sViewsWithIds.put(R.id.play_progressBar1, 23);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDragDropDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentDragDropDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (eu.gsottbauer.equalizerview.EqualizerView) bindings[10]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[21]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.RelativeLayout) bindings[15]
            , (com.wang.avi.AVLoadingIndicatorView) bindings[23]
            , (com.warkiz.widget.IndicatorSeekBar) bindings[16]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[5]
            );
        this.layoutDragDropBg.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}