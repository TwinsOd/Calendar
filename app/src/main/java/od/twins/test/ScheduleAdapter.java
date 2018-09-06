package od.twins.test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jimmy.common.base.app.BaseFragment;
import com.jimmy.common.bean.Schedule;

import java.util.List;

/**
 * Created by Jimmy on 2016/10/8 0008.
 */
public class ScheduleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

//    private int SCHEDULE_TYPE = 1;
//    private int SCHEDULE_CENTER = 2;
//    private int SCHEDULE_FINISH_TYPE = 3;
//    private int SCHEDULE_BOTTOM = 4;

    private Context mContext;
//    private BaseFragment mBaseFragment;
    private List<Schedule> mSchedulesList;
//    private List<Schedule> mFinishSchedules;

    private boolean mIsShowFinishTask = false;

    public ScheduleAdapter(Context context, List<Schedule> mSchedulesList) {
        mContext = context;
        this.mSchedulesList = mSchedulesList;
//        mBaseFragment = baseFragment;
//        initData();
    }

//    private void initData() {
//        mSchedulesList = new ArrayList<>();
//        mFinishSchedules = new ArrayList<>();
//    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ScheduleViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_calendar, parent, false));
//        if (viewType == SCHEDULE_TYPE) {
//            return new ScheduleViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_calendar, parent, false));
//        } else if (viewType == SCHEDULE_FINISH_TYPE) {
//            return new ScheduleFinishViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_schedule_finish, parent, false));
//        } else if (viewType == SCHEDULE_CENTER) {
//            return new ScheduleCenterViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_schedule_center, parent, false));
//        } else {
//            return new ScheduleBottomViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_schedule_bottom, parent, false));
//        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ScheduleViewHolder) {
//            final Schedule schedule = mSchedulesList.get(position);
            final ScheduleViewHolder viewHolder = (ScheduleViewHolder) holder;
            viewHolder.tvScheduleTitle.setText("Test № " + position);
//            viewHolder.vScheduleHintBlock.setBackgroundResource(JeekUtils.getScheduleBlockView(schedule.getColor()));
//            viewHolder.tvScheduleTitle.setText(schedule.getTitle());
//            if (schedule.getTime() != 0) {
//                viewHolder.tvScheduleTime.setText(JeekUtils.timeStamp2Time(schedule.getTime()));
//            } else {
//                viewHolder.tvScheduleTime.setText("");
//            }
//            if (schedule.getState() == 0) {
//                viewHolder.tvScheduleState.setBackgroundResource(R.drawable.start_schedule_hint);
//                viewHolder.tvScheduleState.setText(mContext.getString(R.string.start));
//                viewHolder.tvScheduleState.setTextColor(mContext.getResources().getColor(R.color.color_schedule_start));
//            } else {
//                viewHolder.tvScheduleState.setBackgroundResource(R.drawable.finish_schedule_hint);
//                viewHolder.tvScheduleState.setText(mContext.getString(R.string.finish));
//                viewHolder.tvScheduleState.setTextColor(mContext.getResources().getColor(R.color.color_schedule_finish));
//            }
//            viewHolder.tvScheduleState.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    changeScheduleState(schedule);
//                }
//            });
//            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    if (mBaseFragment instanceof ScheduleFragment) {
//                        mContext.startActivity(new Intent(mContext, ScheduleDetailActivity.class)
//                                .putExtra(ScheduleDetailActivity.SCHEDULE_OBJ, schedule)
//                                .putExtra(ScheduleDetailActivity.CALENDAR_POSITION, ((ScheduleFragment) mBaseFragment).getCurrentCalendarPosition()));
//                    } else {
//                        mContext.startActivity(new Intent(mContext, ScheduleDetailActivity.class)
//                                .putExtra(ScheduleDetailActivity.SCHEDULE_OBJ, schedule)
//                                .putExtra(ScheduleDetailActivity.CALENDAR_POSITION, -1));
//                    }
//                }
//            });
//        } else if (holder instanceof ScheduleFinishViewHolder) {
//            final Schedule schedule = mFinishSchedules.get(position - mSchedulesList.size() - 1);
//            ScheduleFinishViewHolder viewHolder = (ScheduleFinishViewHolder) holder;
//            viewHolder.tvScheduleTitle.setText(schedule.getTitle());
//            if (mIsShowFinishTask) {
//                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
//                params.height = LinearLayout.LayoutParams.WRAP_CONTENT;
//                params.bottomMargin = mContext.getResources().getDimensionPixelSize(R.dimen.space_3dp);
//                viewHolder.itemView.setLayoutParams(params);
//            } else {
//                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
//                params.height = 0;
//                params.bottomMargin = 0;
//                viewHolder.itemView.setLayoutParams(params);
//            }
//            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
//                public void onClick(View v) {
//                    showDeleteScheduleDialog(schedule);
//                }
//            });
//        } else if (holder instanceof ScheduleCenterViewHolder) {
//            ScheduleCenterViewHolder viewHolder = (ScheduleCenterViewHolder) holder;
//            if (mFinishSchedules.size() > 0) {
//                viewHolder.tvChangeTaskList.setEnabled(true);
//            } else {
//                viewHolder.tvChangeTaskList.setEnabled(false);
//            }
//            viewHolder.tvChangeTaskList.setText(mIsShowFinishTask ? mContext.getString(R.string.schedule_hide_finish_task) : mContext.getString(R.string.schedule_show_finish_task));
//            viewHolder.tvFinishHint.setVisibility(mIsShowFinishTask && mFinishSchedules.size() > 0 ? View.VISIBLE : View.GONE);
//            viewHolder.tvChangeTaskList.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mIsShowFinishTask = !mIsShowFinishTask;
//                    notifyDataSetChanged();
//                }
//            });
        }
    }

//    private void showDeleteScheduleDialog(final Schedule schedule) {
//        new ConfirmDialog(mContext, R.string.schedule_delete_this_schedule, new ConfirmDialog.OnClickListener() {
//            @Override
//            public void onCancel() {
//
//            }
//
//            @Override
//            public void onConfirm() {
//                new RemoveScheduleTask(mContext, new OnTaskFinishedListener<Boolean>() {
//                    @Override
//                    public void onTaskFinished(Boolean data) {
//                        if (data) {
//                            removeItem(schedule);
//                            if (mBaseFragment instanceof ScheduleFragment) {
//                                ((ScheduleFragment) mBaseFragment).resetScheduleList();
//                            }
//                        }
//                    }
//                }, schedule.getId()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
//            }
//        }).show();
//    }

//    @Override
//    public int getItemViewType(int position) {
//        if (position < mSchedulesList.size()) {
//            return SCHEDULE_TYPE;
//        } else if (position == mSchedulesList.size()) {
//            return SCHEDULE_CENTER;
//        } else if (position == getItemCount() - 1) {
//            return SCHEDULE_BOTTOM;
//        } else {
//            return SCHEDULE_FINISH_TYPE;
//        }
//    }

    @Override
    public int getItemCount() {
        return mSchedulesList.size()
//                + mFinishSchedules.size() + 2
                ;
    }

    protected class ScheduleViewHolder extends RecyclerView.ViewHolder {

//        protected View vScheduleHintBlock;
//        protected TextView tvScheduleState;
        protected TextView tvScheduleTitle;
//        protected TextView tvScheduleTime;

        public ScheduleViewHolder(View itemView) {
            super(itemView);
//            vScheduleHintBlock = itemView.findViewById(R.id.vScheduleHintBlock);
//            tvScheduleState = (TextView) itemView.findViewById(R.id.tvScheduleState);
            tvScheduleTitle = (TextView) itemView.findViewById(R.id.calendar_tv);
//            tvScheduleTime = (TextView) itemView.findViewById(R.id.tvScheduleTime);
        }

    }

//    protected class ScheduleFinishViewHolder extends RecyclerView.ViewHolder {
//
//        protected StrikeThruTextView tvScheduleTitle;
//        protected TextView tvScheduleTime;
//
//        public ScheduleFinishViewHolder(View itemView) {
//            super(itemView);
//            tvScheduleTitle = (StrikeThruTextView) itemView.findViewById(R.id.tvScheduleTitle);
//            tvScheduleTime = (TextView) itemView.findViewById(R.id.tvScheduleTime);
//        }
//    }
//
//    protected class ScheduleCenterViewHolder extends RecyclerView.ViewHolder {
//
//        protected TextView tvChangeTaskList;
//        protected TextView tvFinishHint;
//
//        public ScheduleCenterViewHolder(View itemView) {
//            super(itemView);
//            tvChangeTaskList = (TextView) itemView.findViewById(R.id.tvChangeTaskList);
//            tvFinishHint = (TextView) itemView.findViewById(R.id.tvFinishHint);
//        }
//    }
//
//    protected class ScheduleBottomViewHolder extends RecyclerView.ViewHolder {
//
//        public ScheduleBottomViewHolder(View itemView) {
//            super(itemView);
//        }
//    }
//
//    public void changeAllData(List<Schedule> schedules) {
//        distinguishData(schedules);
//    }
//
//    public void insertItem(Schedule schedule) {
//        mSchedulesList.add(schedule);
//        notifyItemInserted(mSchedulesList.size() - 1);
//    }
//
//    public void removeItem(Schedule schedule) {
//        if (mSchedulesList.remove(schedule)) {
//            notifyDataSetChanged();
//        } else if (mFinishSchedules.remove(schedule)) {
//            notifyDataSetChanged();
//        }
//    }

//    private void changeScheduleItem(Schedule schedule) {
//        int i = mSchedulesList.indexOf(schedule);
//        if (i != -1) {
//            notifyItemChanged(i);
//        }
//    }

//    private void changeScheduleState(final Schedule schedule) {
//        switch (schedule.getState()) {
//            case 0:
//                schedule.setState(1);
//                new UpdateScheduleTask(mContext, new OnTaskFinishedListener<Boolean>() {
//                    @Override
//                    public void onTaskFinished(Boolean data) {
//                        changeScheduleItem(schedule);
//                    }
//                }, schedule).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
//                break;
//            case 1:
//                schedule.setState(2);
//                new UpdateScheduleTask(mContext, new OnTaskFinishedListener<Boolean>() {
//                    @Override
//                    public void onTaskFinished(Boolean data) {
//                        mSchedulesList.remove(schedule);
//                        mFinishSchedules.add(schedule);
//                        notifyDataSetChanged();
//                    }
//                }, schedule).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
//                break;
//        }
//    }
//
//    private void distinguishData(List<Schedule> schedules) {
//        mSchedulesList.clear();
//        mFinishSchedules.clear();
//        for (int i = 0, count = schedules.size(); i < count; i++) {
//            Schedule schedule = schedules.get(i);
//            if (schedule.getState() == 2) {
//                mFinishSchedules.add(schedule);
//            } else {
//                mSchedulesList.add(schedule);
//            }
//        }
//        notifyDataSetChanged();
//    }

}
