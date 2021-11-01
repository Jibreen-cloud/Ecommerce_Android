package com.rubycom.digital_geidam.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rubycom.digital_geidam.Adapters.ProductAdapter;
import com.rubycom.digital_geidam.R;
import com.rubycom.digital_geidam.RecyclerUtil.DataModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeFragment extends Fragment {
    private ArrayList<DataModel> mlist;

    private ProductAdapter mAdapter;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.mrecycler);

        mlist = new ArrayList<DataModel>();

        int []Images ={R.drawable.jb1, R.drawable.jb2, R.drawable.jb3};
        int []Images1 ={R.drawable.jb3, R.drawable.phone1, R.drawable.phone3};
        int []Images3 ={R.drawable.jb2, R.drawable.phone2, R.drawable.phone3};
        int []Images4 ={R.drawable.jb1, R.drawable.phone2, R.drawable.jb3};
        int []Images2 ={R.drawable.jb3, R.drawable.phone1, R.drawable.phone3};

        mlist.add(new DataModel(Images,22.2,"2GB Ram, 3MPx Camera","Jibrilla"));
        mlist.add(new DataModel(Images1,222.2,"2GB Ram, 3MPx Camera","Alanjito"));
        mlist.add(new DataModel(Images,22.2,"2GB Ram, 3MPx Camera","Jibrilla"));
        mlist.add(new DataModel(Images1,222.2,"2GB Ram, 3MPx Camera","Alanjito"));
        mlist.add(new DataModel(Images,22.2,"2GB Ram, 3MPx Camera","Jibrilla"));
        mlist.add(new DataModel(Images1,222.2,"2GB Ram, 3MPx Camera","Alanjito"));
        mlist.add(new DataModel(Images2,32.2,"2GB Ram, 3MPx Camera","Samsung Galaxy III"));
        mlist.add(new DataModel(Images3,442.2,"2GB Ram, 3MPx Camera","Fold 2 "));
        mlist.add(new DataModel(Images4,2552.2,"2GB Ram, 3MPx Camera","Social Media "));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mAdapter = new ProductAdapter(mlist,getActivity());
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}