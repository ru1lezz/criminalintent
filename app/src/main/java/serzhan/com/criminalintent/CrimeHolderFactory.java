package serzhan.com.criminalintent;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public interface CrimeHolderFactory {
    CrimeAdapter.CrimeHolder createCrimeHolder(ViewGroup parent, LayoutInflater inflater);
}

