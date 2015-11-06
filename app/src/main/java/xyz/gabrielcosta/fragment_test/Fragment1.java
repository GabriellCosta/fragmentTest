package xyz.gabrielcosta.fragment_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Gabriel Costa on 05/11/2015.
 * email: gabriel.costa@entelgy.com
 */
public class Fragment1 extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment1, container, false);

        textView = (TextView) inflate.findViewById(R.id.frag1_text2);

        textView.setText(getArguments().getString(FragmentActivity.TEXT_VIEW));

        return inflate;
    }
}
