/*
 * Copyright (C) 2021 Dev Sebastian
 * This file is part of WonderScan <https://github.com/devsebastian/WonderScan>.
 *
 * WonderScan is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WonderScan is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WonderScan.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.nikhilverma360.DocumentScan.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.nikhilverma360.DocumentScan.R;

public class KycActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyc);

        TextView textView = findViewById(R.id.Scan_docs);
        TextView textView1 = findViewById(R.id.kycmessage);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!= null){
            String j = (String) b.get("saved");
            textView1.setText("");
            textView.setText("upload now");
            textView1.setBackgroundResource(R.drawable.ic_doc);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(KycActivity.this, "Upload Btn Clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
        if(b== null){
            textView.setOnClickListener(view -> {
                Intent i = new Intent(KycActivity.this, ScanActivity.class);
                startActivity(i);
            });
        }

    }
}