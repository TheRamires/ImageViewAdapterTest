package ram.ramires.viewadaptertest;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class ViewModelTest extends AndroidViewModel {
    MutableLiveData<List<Entity>> liveData=new MutableLiveData<>();

    public ViewModelTest(@NonNull Application application) {
        super(application);
    }

    public void getData(){
        Entity entity=new Entity("Ferrari","ferrari");
        Entity entity2=new Entity("McLaren","mclaren");

        List<Entity> list=new ArrayList<>();
        list.add(entity);
        list.add(entity2);

        liveData.setValue(list);
    }
}
