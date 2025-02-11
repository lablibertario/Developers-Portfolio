/*Copyright (c) 2018 Madona Syombua

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
 */
package com.madonasyombua.growwithgoogleteamproject.ui.fragment;


import android.app.DialogFragment;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.madonasyombua.growwithgoogleteamproject.R;

import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageDialog extends DialogFragment {

    public ImageDialog() {
            // Empty constructor required for DialogFragment
        }

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param bitmap The image to display.
         * @return A new instance of fragment PostDialog.
         */
        public static ImageDialog newInstance(Bitmap bitmap) {
            ImageDialog fragment = new ImageDialog();
            Bundle args = new Bundle();
            args.putParcelable("bitmap", bitmap);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_image_dialog, container, false);

            ImageView image = view.findViewById(R.id.image);
            Bitmap bitmap = getArguments().getParcelable("bitmap");
            image.setImageBitmap(bitmap);

            ImageView closeButton = view.findViewById(R.id.closeButton);
            closeButton.setOnClickListener(
                    v -> dismiss()
            );

            Objects.requireNonNull(getDialog().getWindow()).setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

            return view;
        }

        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
        @Override
        public void onResume() {
            // Get existing layout params for the window
            WindowManager.LayoutParams params = Objects.requireNonNull(getDialog().getWindow()).getAttributes();
            // Assign window properties to fill the parent
            params.width = WindowManager.LayoutParams.WRAP_CONTENT;
            params.height = WindowManager.LayoutParams.WRAP_CONTENT;
            getDialog().getWindow().setAttributes(params);
            // Call super onResume after sizing
            super.onResume();
        }

    public void show(FragmentManager fm, String fragment_image_dialog) {
    }
}


