package xyz.gabrielcosta.fragment_test;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

/**
 * Created by Gabriel Costa on 05/11/2015.
 * email: gabriel.costa@entelgy.com
 */
public class FragmentActivity extends android.support.v4.app.FragmentActivity {

    public static final String TEXT_VIEW = "TextView";
    public static final String EDIT_TEXT = "EditText";
    android.support.v4.app.Fragment frag1 = new Fragment1();
    android.support.v4.app.Fragment frag2 = new Fragment2();
    boolean control = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articles_activity);

        Bundle args2 = new Bundle();
        args2.putString(TEXT_VIEW, "Fragmento 1 selecionado");
        frag1.setArguments(args2);

        Bundle args = new Bundle();
        args.putString(TEXT_VIEW, "Fragmento 2");
        args.putString(EDIT_TEXT, "Fragmento 2 EditText");
        frag2.setArguments(args);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, frag1).commit();
    }

    public void changeFragment(View view) {
        if (control) {
            updateReplaceFragment(frag2);
        } else {
            updateReplaceFragment(frag1);
        }
    }


    private void updateReplaceFragment(android.support.v4.app.Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
        control = !control;
    }
}
