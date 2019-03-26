package movie.ticket.rating;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;

public class rating extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myInflatedView = inflater.inflate(R.layout.fragment_rating, container,false);
        TextView t1;
        ImageView i1;
        ImageView i2;
        TextView t2;
        RatingBar r1;
        RatingBar r2;
        RatingBar r3;
// Inflate the layout for this fragment

        i1=myInflatedView.findViewById(R.id.imageView6);
        t2=myInflatedView.findViewById(R.id.textView50);
        r1=myInflatedView.findViewById(R.id.ratingBar);
        r2=myInflatedView.findViewById(R.id.ratingBar2);
        r3=myInflatedView.findViewById(R.id.ratingBar3);


            t2.setText("Yours");
            r1.setRating(3.5f);
            r2.setRating(4f);


            t2.setText("Yours");
            r1.setRating(3f);
            r2.setRating(3.5f);


            t2.setText("Yours");
            r1.setRating(2.5f);
            r2.setRating(3f);


        return myInflatedView;

    }


}
