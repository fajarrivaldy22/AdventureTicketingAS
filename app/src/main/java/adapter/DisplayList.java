package adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aldi.adventureticketing.R;
import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import model.Ticket;

public class DisplayList extends RecyclerView.Adapter<DisplayList.TicketViewHolder> {

    private Context context;
    private List<Ticket> tickets;

    public DisplayList(Context context, List<Ticket> tickets) {
        this.context = context;
        this.tickets = tickets;
    }

    @NonNull
    @Override
    public TicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_adventure_ticket_adapter,null);
        TicketViewHolder ticketViewHolder = new TicketViewHolder(view);
        return ticketViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TicketViewHolder holder, int position) {
        final Ticket ticket = tickets.get(position);
        NumberFormat format = NumberFormat.getInstance();
        final String[] images = ticket.getImageEvent();

        holder.txtNameEvent.setText(ticket.getEventName());
        holder.txtDate.setText(ticket.getDateHeld());
        holder.txtCommunity.setText(ticket.getCommunity());
        holder.txtDuration.setText(String.valueOf(ticket.getDuration())+" day(s)");
        holder.txtLocation.setText(ticket.getLocation());
        holder.txtPrice.setText(format.format(ticket.getPrice()));
        holder.crslImageContainer.setPageCount(ticket.getImageEvent().length);
        ImageListener imageListener = new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                Picasso.get().load(images[position]).into(imageView);
                Picasso.get().setIndicatorsEnabled(true);
            }
        };
        holder.crslImageContainer.setImageListener(imageListener);


    }

    @Override
    public int getItemCount() {
        return tickets.size();
    }

    class TicketViewHolder extends RecyclerView.ViewHolder{

        TextView txtNameEvent, txtPrice, txtDate, txtLocation, txtCommunity, txtDuration;
        CarouselView crslImageContainer;

        public TicketViewHolder(View itemView) {
            super(itemView);

            crslImageContainer = itemView.findViewById(R.id.crsEventImage);

            txtNameEvent = (TextView) itemView.findViewById(R.id.txtListNameEventAdapter);
            txtPrice = (TextView) itemView.findViewById(R.id.txtListPriceEventAdapter);
            txtDate = (TextView) itemView.findViewById(R.id.txtDateListAdapter);
            txtLocation = (TextView) itemView.findViewById(R.id.txtListLocationEventAdapter);
            txtCommunity = (TextView) itemView.findViewById(R.id.txtCommunityListAdapter);
            txtDuration = (TextView) itemView.findViewById(R.id.txtDurationListAdapter);
        }
    }

}
