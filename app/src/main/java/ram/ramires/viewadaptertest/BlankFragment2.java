package ram.ramires.viewadaptertest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ram.ramires.viewadaptertest.databinding.FragmentBlank2Binding;

public class BlankFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentBlank2Binding binding=FragmentBlank2Binding.inflate(inflater);
        binding.setFragment(this);
        View view=binding.getRoot();

        ViewModelTest viewModel=new ViewModelProvider(requireActivity()).get(ViewModelTest.class);

        RecyclerView recyclerView=binding.recycler;
        viewModel.getData();


        viewModel.liveData.observe(getViewLifecycleOwner(), new Observer<List<Entity>>() {
            @Override
            public void onChanged(List<Entity> entities) {
                RecyclerView.Adapter adapter=new Recycler_View_Adapter(entities);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

            }
        });

        return view;
    }
}