package com.example.practicaandroid.ui.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragmentAdapter (fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    val listaFragmento: MutableList<Fragment> = ArrayList()
    val tituloFragmento: MutableList<String> = ArrayList()

    override fun getCount(): Int {
        return listaFragmento.size
    }

    override fun getItem(position: Int): Fragment {
        return listaFragmento[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return tituloFragmento[position]
    }

    fun addFragmento(fragment: Fragment, titulo: String) {
        listaFragmento.add(fragment)
        tituloFragmento.add(titulo)
    }
}