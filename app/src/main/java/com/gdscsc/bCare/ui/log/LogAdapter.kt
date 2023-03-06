package com.gdscsc.bCare.ui.log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gdscsc.bCare.data.Log
import com.gdscsc.bCare.databinding.LogListItemBinding
import java.util.*

class LogAdapter(private val logs: List<Log>, private val onClick: LogClickView) :
    RecyclerView.Adapter<LogAdapter.ViewHolder>() {

    interface LogClickView {
        fun onClick(view: View, logDate: Date)

    }

    class ViewHolder(private val binding: LogListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(log: Log, onClick: LogClickView) {
            binding.run {
                this.log = log
                clickHandler = onClick
                executePendingBindings()
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LogListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun getItemCount() = logs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(this.logs[position], onClick)
    }
}