package com.neppplus.viewpager_20210731.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.neppplus.viewpager_20210731.fragments.HelloFragment
import com.neppplus.viewpager_20210731.fragments.MyInfoFragment
import com.neppplus.viewpager_20210731.fragments.NameFragment

class MainViewPagerAdapter( fm : FragmentManager ) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {

        return when (position) {
            0 -> "이름"
            1 -> "정보"
            else -> "인사말"
        }

    }

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when( position ) {
            0 -> NameFragment()
            1 -> MyInfoFragment()
            else -> HelloFragment()
        }

    }


}