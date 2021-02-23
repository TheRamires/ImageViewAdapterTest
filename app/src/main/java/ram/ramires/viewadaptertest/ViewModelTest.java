package ram.ramires.viewadaptertest;

import android.app.Application;
import android.view.Display;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ViewModelTest extends AndroidViewModel {
    private Model model=new Model();
    MutableLiveData<List<Entity>> liveData=new MutableLiveData<>();

    public ViewModelTest(@NonNull Application application) {
        super(application);
    }

    public void getData(){
        model.getDataFromApi(liveData);
    }
}
