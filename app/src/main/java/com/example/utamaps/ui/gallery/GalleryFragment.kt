package com.example.utamaps.ui.gallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.utamaps.MapaGeneral
import com.example.utamaps.databinding.FragmentDeptosBinding
import com.google.android.material.transition.Hold

class GalleryFragment : Fragment() {

    private var _binding: FragmentDeptosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentDeptosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        /*binding.btnFisica.setOnClickListener(View.OnClickListener(){
            val Intent = Intent(activity, MapaGeneral::class.java)
            Intent.putExtra("dir", -18.49148679859103)
            Intent.putExtra("dir2", -70.29703741095733)
            startActivity(Intent)
        })

        binding.btnInformatica.setOnClickListener(View.OnClickListener(){
            val Intent = Intent(activity, MapaGeneral::class.java)
            Intent.putExtra("dir", -18.489173929600813)
            Intent.putExtra("dir2", -70.29522556891044)
            startActivity(Intent)
        })*/

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}