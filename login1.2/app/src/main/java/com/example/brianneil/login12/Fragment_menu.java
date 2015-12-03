package com.example.brianneil.login12;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by Alejandro on 11/11/2015.
 */
public class Fragment_menu extends Fragment
{
    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fm_menu, container, false);
        return rootView;
    }

}
