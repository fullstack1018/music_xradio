package com.ypyglobal.xradio.databinding;
import com.ypyglobal.xradio.R;
import com.ypyglobal.xradio.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAppBarMainBindingImpl extends ActivityAppBarMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.my_toolbar, 2);
        sViewsWithIds.put(R.id.layout_total_drag_drop, 3);
        sViewsWithIds.put(R.id.tab_layout, 4);
        sViewsWithIds.put(R.id.view_pager, 5);
        sViewsWithIds.put(R.id.container, 6);
        sViewsWithIds.put(R.id.img_touch, 7);
        sViewsWithIds.put(R.id.layout_ads, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAppBarMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityAppBarMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[0]
            , (bindings[3] != null) ? com.ypyglobal.xradio.databinding.ItemDragDropBinding.bind((android.view.View) bindings[3]) : null
            , (bindings[2] != null) ? com.ypyglobal.xradio.databinding.ItemToolbarBinding.bind((android.view.View) bindings[2]) : null
            , (com.google.android.material.tabs.TabLayout) bindings[4]
            , (com.ypyglobal.xradio.ypylibs.view.YPYViewPager) bindings[5]
            );
        this.appBar.setTag(null);
        this.layoutBg.setTag(null);
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