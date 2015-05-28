//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.order.manage.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.order.manage.R.id;
import com.order.manage.R.layout;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class HistoryActivity_
    extends HistoryActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_history);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static HistoryActivity_.IntentBuilder_ intent(Context context) {
        return new HistoryActivity_.IntentBuilder_(context);
    }

    public static HistoryActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new HistoryActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        TextViewPriceTotalNum = ((TextView) hasViews.findViewById(id.TextViewPriceTotalNum));
        ListViewWareListItem = ((ListView) hasViews.findViewById(id.ListViewWareListItem));
        ImageViewArrow = ((ImageView) hasViews.findViewById(id.ImageViewArrow));
        LinearLayoutOrderDetail = ((LinearLayout) hasViews.findViewById(id.LinearLayoutOrderDetail));
        TextViewOrderId = ((TextView) hasViews.findViewById(id.TextViewOrderId));
        TextViewOrderSubmitTime = ((TextView) hasViews.findViewById(id.TextViewOrderSubmitTime));
        TextViewOrderRemarks = ((TextView) hasViews.findViewById(id.TextViewOrderRemarks));
        ListViewOrderHistory = ((ListView) hasViews.findViewById(id.ListViewOrderHistory));
        {
            View view = hasViews.findViewById(id.LinearLayoutHistoryOrderInputClick);
            if (view!= null) {
                view.setOnClickListener(new OnClickListener() {


                    @Override
                    public void onClick(View view) {
                        HistoryActivity_.this.OnclickHistoryOrderInputClick();
                    }

                }
                );
            }
        }
        initView();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<HistoryActivity_.IntentBuilder_>
    {

        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, HistoryActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            super(fragment.getActivity(), HistoryActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                super.startForResult(requestCode);
            }
        }

    }

}
