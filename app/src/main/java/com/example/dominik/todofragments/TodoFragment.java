package com.example.dominik.todofragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.*;
import android.widget.*;

/**
 * Created by Dominik on 22/11/2017.
 */

public class TodoFragment extends Fragment {
    private Todo mTodo;
    private EditText mEditTextTitle;
    private Button mButtonDate;
    private CheckBox mCheckBoxIsComplete;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTodo = new Todo();
        mTodo.setTitle("Hello!");
        mTodo.setIsComplete(true);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_todo, container, false);

        mEditTextTitle = view.findViewById(R.id.todo_title);
        mEditTextTitle.setText(mTodo.getTitle());
        mEditTextTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mTodo.setTitle(charSequence.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mButtonDate = view.findViewById(R.id.todo_date);
        mButtonDate.setText(mTodo.getDate().toString());
        mButtonDate.setEnabled(false);

        mCheckBoxIsComplete = view.findViewById(R.id.todo_complete);
        mCheckBoxIsComplete.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                mTodo.setIsComplete(b);
            }
        });
        return view;
    }
}
