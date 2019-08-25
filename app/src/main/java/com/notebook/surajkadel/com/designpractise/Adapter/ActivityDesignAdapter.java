package com.notebook.surajkadel.com.designpractise.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.notebook.surajkadel.com.designpractise.Model.RecyclerDetail;
import com.notebook.surajkadel.com.designpractise.R;

import java.util.List;

public class ActivityDesignAdapter extends RecyclerView.Adapter<ActivityDesignAdapter.ViewHolder> {
    private List<RecyclerDetail> recyclerDetails;

    public ActivityDesignAdapter(List<RecyclerDetail> recyclerDetails) {
        this.recyclerDetails = recyclerDetails;
    }

    @NonNull
    @Override
    public ActivityDesignAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.mylist,parent,false);
        return new ViewHolder(itemview);
    }



    @Override
    public void onBindViewHolder(@NonNull ActivityDesignAdapter.ViewHolder holder, int position) {
        RecyclerDetail detail = recyclerDetails.get(position);
        holder.place.setText(detail.getPlace());
        holder.time.setText(detail.getTime());
        holder.travels.setText(detail.getTravels());
        holder.description.setText(detail.getDescription());
        holder.bustype.setText(detail.getBustype());
        holder.previousrate.setText(detail.getPreviousrate());
        holder.newrate.setText(detail.getNewrate());

    }

    @Override
    public int getItemCount() {
        return recyclerDetails.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView place, time, travels,description, bustype,previousrate, newrate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            place = itemView.findViewById(R.id.tvStation);
            time = itemView.findViewById(R.id.tvTime);
            travels = itemView.findViewById(R.id.tvTravels);
            description = itemView.findViewById(R.id.tvDescription);
            bustype = itemView.findViewById(R.id.tvBusType);
            previousrate= itemView.findViewById(R.id.tvPreviousrate);
            newrate = itemView.findViewById(R.id.tvNewrate);
        }
    }
}
