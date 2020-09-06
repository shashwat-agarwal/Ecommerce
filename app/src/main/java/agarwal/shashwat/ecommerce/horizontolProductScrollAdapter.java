package agarwal.shashwat.ecommerce;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;

public class horizontolProductScrollAdapter  extends FirestoreRecyclerAdapter<horizontalProductModel, horizontolProductScrollAdapter.ViewHolder> {

    /**
     * Create a new RecyclerView adapter that listens to a Firestore Query.  See {@link
     * FirestoreRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public horizontolProductScrollAdapter(@NonNull FirestoreRecyclerOptions<horizontalProductModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull horizontalProductModel model) {
           holder.productName.setText(model.getProductName());
           holder.productQuantity.setText(model.getProductQuantity());
           holder.productPrice.setText(model.getProductPrice());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_scroll_item_layout, parent,false);
       return new ViewHolder(v);
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView productName,productPrice,productQuantity;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            productName=itemView.findViewById(R.id.productName);
            productPrice=itemView.findViewById(R.id.productPrice);
            productQuantity=itemView.findViewById(R.id.productQuantity);
        }
    }
}
