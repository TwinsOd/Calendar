package od.twins.test;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jimmy on 2016/10/8 0008.
 */
public class ScheduleAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<String> mSchedulesList;


    ScheduleAdapter(Context context, List<String> mSchedulesList) {
        mContext = context;
        this.mSchedulesList = mSchedulesList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ScheduleViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_calendar, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ScheduleViewHolder) {
            final ScheduleViewHolder viewHolder = (ScheduleViewHolder) holder;
            viewHolder.tvScheduleTitle.setText("Test № " + position);
        }
    }

    @Override
    public int getItemCount() {
        return mSchedulesList.size();
    }

    protected class ScheduleViewHolder extends RecyclerView.ViewHolder {
        TextView tvScheduleTitle;

        ScheduleViewHolder(View itemView) {
            super(itemView);
            tvScheduleTitle = itemView.findViewById(R.id.calendar_tv);
        }
    }
}
