package com.example.viewpageroneexercise.controler

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpageroneexercise.view.AboutFragment
import com.example.viewpageroneexercise.view.SkillFragment
import com.example.viewpageroneexercise.view.WorkFragment

class PagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        // harus return per item nya
        return 3
    }

    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return AboutFragment()
            1 -> return SkillFragment()
            2 -> return WorkFragment()
        }
        // return fragment nya
        return AboutFragment()
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> return "HOME"
            1 -> return "SKILL"
            2 -> return "WORK"
        }
        return super.getPageTitle(position)
    }
}