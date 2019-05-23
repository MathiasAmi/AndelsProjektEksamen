package dk.cosby.andelsprojekt.view;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import dk.cosby.andelsprojekt.R;
import dk.cosby.andelsprojekt.view.viewmodel.CreateUserViewModel;

public class CreateUserActivity extends AppCompatActivity {

    private CreateUserViewModel viewModel;
    private EditText email, password;
    private Button create_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        email = (EditText) findViewById(R.id.et_email_create_user);
        password = (EditText) findViewById(R.id.et_password_create_user);
        create_user = (Button) findViewById(R.id.btn_create_user);


        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s != null) {
                    viewModel.setCurrentUserEmail(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s != null) {
                    viewModel.setCurrentUserPassword(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


          viewModel = ViewModelProviders.of(this).get(CreateUserViewModel.class);
//
//        final Observer<String> emailStringObserver = new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable final String a) {
//                // Update the UI, in this case, a TextView.
//                email.setText(a);
//            }
//        };
//
//        viewModel.observeEmail(this, emailStringObserver);
//
//        final Observer<String> passwordStringObserver = new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable final String a) {
//                // Update the UI, in this case, a TextView.
//                email.setText(a);
//            }
//        };
//
//        viewModel.observePassword(this, passwordStringObserver);

    }

    public void createUser(View view) {



    }
}
