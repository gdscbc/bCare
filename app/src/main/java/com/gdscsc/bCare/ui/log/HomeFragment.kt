package com.gdscsc.bCare.ui.log

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gdscsc.bCare.data.Log
import com.gdscsc.bCare.databinding.FragmentHomeBinding
import com.gdscsc.bCare.utils.LogDate
import java.time.LocalDate
import java.util.*

class HomeFragment : Fragment() {

    private lateinit var onClick: LogAdapter.LogClickView
    private var _binding: FragmentHomeBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val onClick : LogAdapter.LogClickView = object :LogAdapter.LogClickView {
            override fun onClick(view: View, logDate: Date) {
                Toast.makeText(requireContext(), "Clicked", Toast.LENGTH_SHORT).show()
            }

        }
        this.onClick = onClick
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val logs = mutableListOf<Log>()
        logs.add(Log(LogDate(), "", "", ""))
        logs.add(Log(LogDate(), "", "", ""))
        logs.add(Log(LogDate(), "", "", ""))
        recyclerView = binding.logRecycler
        recyclerView.adapter = LogAdapter(logs, onClick)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}