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
        sViewsWithIds.put(R.id.my_toolbar, 3);
        sViewsWithIds.put(R.id.layout_total_drag_drop, 4);
        sViewsWithIds.put(R.id.tab_layout, 5);
        sViewsWithIds.put(R.id.view_pager, 6);
        sViewsWithIds.put(R.id.container, 7);
        sViewsWithIds.put(R.id.img_touch, 8);
        sViewsWithIds.put(R.id.layout_ads, 9);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAppBarMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityAppBarMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.FrameLayout) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[0]
            , (bindings[4] != null) ? com.ypyglobal.xradio.databinding.ItemDragDropBinding.bind((android.view.View) bindings[4]) : null
            , (bindings[3] != null) ? com.ypyglobal.xradio.databinding.ItemToolbarBinding.bind((android.view.View) bindings[3]) : null
            , (com.google.android.material.tabs.TabLayout) bindings[5]
            , (com.ypyglobal.xradio.ypylibs.view.YPYViewPager) bindings[6]
            );
        this.appBar.setTag(null);
        this.layoutBg.setTag(null);
        this.mboundView2 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[2];
        this.mboundView2.setTag(null);
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