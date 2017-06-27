package br.com.reebrando.undergoundapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.reebrando.undergoundapp.R;
import br.com.reebrando.undergoundapp.api.APIUtils;
import br.com.reebrando.undergoundapp.model.Line;

/**
 * Created by logonrm on 26/06/2017.
 */

public class LinesAdapter extends RecyclerView.Adapter<LinesAdapter.AndroidViewHolder>{

    private List<Line> lines;

    public LinesAdapter(List<Line> lines){
        this.lines = lines;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View meuLayout = inflater.inflate(R.layout.android_row, parent, false);

        return  new AndroidViewHolder(meuLayout);
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, int position) {
        holder.tvColor.setText(lines.get(position).getColor());
        holder.tvNumber.setText(String.valueOf(lines.get(position).getNumber()));
        Picasso.with(holder.itemView.getContext())
                .load(APIUtils.BASE_URL + lines.get(position).getUrlImage())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivLogo);
    }

    @Override
    public int getItemCount() {
        return lines.size();
    }

    public class AndroidViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivLogo;
        public TextView tvColor;
        public TextView tvNumber;

        public AndroidViewHolder(View itemView) {
            super(itemView);
            ivLogo = (ImageView) itemView.findViewById(R.id.ivLogo);
            tvColor = (TextView) itemView.findViewById(R.id.tvColor);
            tvNumber = (TextView) itemView.findViewById(R.id.tvNumber);
        }
    }

    public void update(List<Line> lines){
        this.lines = lines;
        notifyDataSetChanged();
    }
}
