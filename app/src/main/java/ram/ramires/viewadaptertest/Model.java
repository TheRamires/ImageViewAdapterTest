package ram.ramires.viewadaptertest;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class Model {
    TestData testData=new TestData();
    public void getDataFromApi(MutableLiveData<List<Entity>> liveData){
        liveData.setValue(testData.getData());

    }
}
