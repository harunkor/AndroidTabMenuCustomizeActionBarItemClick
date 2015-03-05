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

public class Tab3 extends Fragment {

	private TextView txtViewTab3;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View view3 = inflater.inflate(R.layout.tab3_layout, container, false);

		setHasOptionsMenu(true); //

		return view3;

	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		 menu.findItem(R.id.ItemIcon).setVisible(false);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.ItemIcon:

			Toast.makeText(getActivity(),
					"Clicked tab 3 at customize icon of item menu", Toast.LENGTH_SHORT)
					.show();

			break;

		}

		return false;
	}

}
