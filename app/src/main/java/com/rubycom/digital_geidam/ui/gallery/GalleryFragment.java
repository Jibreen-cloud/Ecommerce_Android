package com.rubycom.digital_geidam.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.rubycom.digital_geidam.R;
import com.rubycom.digital_geidam.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {
    private WebView web;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        web = root.findViewById(R.id.mweb);
        web.loadUrl("https://rubycom-projects.web.app");
        WebSettings settings = web.getSettings();
        settings.setJavaScriptEnabled(true);
        web.setScrollbarFadingEnabled(true);
        web.canGoBack();
        return root;
    }

}
