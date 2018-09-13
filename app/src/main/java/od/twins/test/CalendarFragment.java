package od.twins.test;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jeek.calendar.widget.calendar.OnCalendarClickListener;
import com.jeek.calendar.widget.calendar.schedule.ScheduleLayout;
import com.jeek.calendar.widget.calendar.schedule.ScheduleRecyclerView;
import com.jimmy.common.base.app.BaseFragment;
import com.jimmy.common.bean.Schedule;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalendarFragment extends BaseFragment implements OnCalendarClickListener {
    private ScheduleLayout slSchedule;
    private ScheduleRecyclerView rvScheduleList;
    private ScheduleAdapter mScheduleAdapter;
    private RelativeLayout rLNoTask;
    private int mCurrentSelectYear, mCurrentSelectMonth, mCurrentSelectDay;
    private TextView monthView;
    private ImageView leftView, rightView;
    private String[] mMonthText;

    public CalendarFragment() {
        // Required empty public constructor
    }

    public static CalendarFragment newInstance() {
        return new CalendarFragment();
    }

    @Nullable
    @Override
    protected View initContentView(LayoutInflater inflater, @Nullable ViewGroup container) {
        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }

    @Override
    protected void bindView() {
        slSchedule = searchViewById(R.id.slSchedule);
//        etInputContent = searchViewById(R.id.etInputContent);
        rLNoTask = searchViewById(R.id.rlNoTask);
        rLNoTask.setVisibility(View.GONE);
        slSchedule.setOnCalendarClickListener(this);
//        searchViewById(R.id.ibMainClock).setOnClickListener(this);
//        searchViewById(R.id.ibMainOk).setOnClickListener(this);
        initScheduleList();
//        initBottomInputBar();
        monthView = searchViewById(R.id.month_view);
        leftView = searchViewById(R.id.left_view);
        leftView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slSchedule.onLeftMove();
            }
        });
        rightView = searchViewById(R.id.right_view);
        rightView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slSchedule.onRightMove();
            }
        });
        mMonthText = getResources().getStringArray(R.array.calendar_month);
    }

    private void initScheduleList() {
        rvScheduleList = slSchedule.getSchedulerRecyclerView();
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rvScheduleList.setLayoutManager(manager);
        DefaultItemAnimator itemAnimator = new DefaultItemAnimator();
        itemAnimator.setSupportsChangeAnimations(false);
        rvScheduleList.setItemAnimator(itemAnimator);
        List<Schedule> list = new ArrayList<>();
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        list.add(new Schedule());
        mScheduleAdapter = new ScheduleAdapter(getContext(), list);
        rvScheduleList.setAdapter(mScheduleAdapter);
    }

    @Override
    public void onClickDate(int year, int month, int day, boolean b) {
//        Toast.makeText(mActivity, "onClickDate: Day is " + day, Toast.LENGTH_SHORT).show();
        setCurrentSelectDate(year, month, day);
//        resetScheduleList();
    }

    @Override
    public void onPageChange(int year, int month, int day) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(10);
        list.add(20);
        list.add(23);
        slSchedule.setEventData(list);
    }

    private void setCurrentSelectDate(int year, int month, int day) {
        mCurrentSelectYear = year;
        mCurrentSelectMonth = month;
        mCurrentSelectDay = day;
        monthView.setText(mMonthText[month]);
    }
}
