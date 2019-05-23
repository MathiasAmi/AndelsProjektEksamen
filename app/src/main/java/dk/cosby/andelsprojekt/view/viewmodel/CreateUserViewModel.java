package dk.cosby.andelsprojekt.view.viewmodel;


import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import java.util.regex.*;

import dk.cosby.andelsprojekt.model.User;

public class CreateUserViewModel extends ViewModel {

    private MutableLiveData<String> currentUserEmail = new MutableLiveData<>();
    private MutableLiveData<String> currentUserPassword = new MutableLiveData<>();
    private User user = new User();

    public CreateUserViewModel() {
        currentUserEmail.setValue(user.getEmailAdresse());
        currentUserPassword.setValue(user.getPassword());
    }

    //Foretag ændring i modellen
    public void setCurrentUserEmail(String userEmail){
        user.setEmailAdresse(userEmail);
        currentUserEmail.setValue(user.getEmailAdresse());
    }

    //Foretag ændring i modellen
    public void setCurrentUserPassword(String userPassword){
        currentUserPassword.setValue(userPassword);
        user.setEmailAdresse(user.getPassword());
    }

    public MutableLiveData<String> getCurrentUserEmail() {
        return currentUserEmail;
    }

    public MutableLiveData<String> getCurrentUserPassword() {
        return currentUserPassword;
    }

    public void observeEmail(LifecycleOwner lifeCycleOwner, Observer<String> stringObserver) {
        currentUserEmail.observe(lifeCycleOwner, stringObserver);
    }

    public void observePassword(LifecycleOwner lifeCycleOwner, Observer<String> stringObserver) {
        currentUserPassword.observe(lifeCycleOwner, stringObserver);
    }


}
