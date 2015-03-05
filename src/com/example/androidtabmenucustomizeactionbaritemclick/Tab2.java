package com.example.androidtabmenucustomizeactionbaritemclick;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Tab2 extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View view2 = inflater.inflate(R.layout.tab2_layout, container, false);

		setHasOptionsMenu(true); //

		return view2;

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.ItemIcon:

			Toast.makeText(getActivity(),
					"Clicked tab 2 at customize icon of item menu",
					Toast.LENGTH_SHORT).show();

			break;

		}
		return false;

	}

}
