package com.example.arkloydanenias_ceng319_lab1_ex1;
import android.content.Intent;
import android.os.Bundle;
import android.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class List extends ListFragment {
    Intent concept;
    String[] x = {
            "\n\nAIActivity",
            "VRActivity"
    };
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,x));
    }
    public void onListItemClick(ListView l, View v, int position, long id){

        switch(position){
            case 0:
                concept = new Intent(getActivity(),AIActivity.class);
                break;
            case 1:
                concept= new Intent(getActivity(),VRActivity.class);
                break;

        }
        startActivity(concept);
    }

}
