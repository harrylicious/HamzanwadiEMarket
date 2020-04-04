package id.lombokit.emarkethamzanwadi.Adapters;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import id.lombokit.emarkethamzanwadi.Fragments.BeritaListFragment;
import id.lombokit.emarkethamzanwadi.Fragments.PemberitahuanListFragment;

/**
 * Created by wolfsoft on 10/11/2015.
 */
public class NotifPagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    int mNumOfTabs;


    public NotifPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        PemberitahuanListFragment pemberitahuanListFragment = new PemberitahuanListFragment();
        mFragmentList.add(pemberitahuanListFragment);
        return mFragmentList.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }


}