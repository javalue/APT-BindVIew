package com.example.aptwoker;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.apt_annotation.BindView;
import com.example.apt_library.BindViewTools;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.tv)
  TextView mTextView;
  @BindView(R.id.btn)
  Button mButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    BindViewTools.bind(this);
    mTextView.setText("bind TextView success");
    mButton.setText("bind Button success");
  }
}
