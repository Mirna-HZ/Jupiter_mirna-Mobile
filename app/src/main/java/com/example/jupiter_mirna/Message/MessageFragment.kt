package com.example.jupiter_mirna.Message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jupiter_mirna.databinding.FragmentMessageBinding


class MessageFragment : Fragment() {

    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!
    private val messageList = listOf(
        MessageModel("Alya", "Halo! Apa kabar?", "https://avatar.iran.liara.run/public/1", timestamp = "10:30 AM"),
        MessageModel("Budi", "Sudah makan?", "https://avatar.iran.liara.run/public/2", timestamp = "11:15 AM"),
        MessageModel("Citra", "Jangan lupa tugasnya ya!", "https://avatar.iran.liara.run/public/3", timestamp = "12:45 PM"),
        MessageModel("Dika", "Besok kita rapat jam 9", "https://avatar.iran.liara.run/public/4", timestamp = "1:20 PM"),
        MessageModel("Eka", "Nice job kemarin!", "https://avatar.iran.liara.run/public/5", timestamp = "2:10 PM"),
        MessageModel("Fajar", "Lagi ngapain?", "https://avatar.iran.liara.run/public/6", timestamp = "3:05 PM"),
        MessageModel("Gita", "Boleh minta tolong?", "https://avatar.iran.liara.run/public/7", timestamp = "4:00 PM"),
        MessageModel("Hana", "Lihat email ya", "https://avatar.iran.liara.run/public/8", timestamp = "5:30 PM"),
        MessageModel("Irfan", "Oke noted", "https://avatar.iran.liara.run/public/9", timestamp = "6:45 PM"),
        MessageModel("Joko", "Sampai jumpa besok", "https://avatar.iran.liara.run/public/10", timestamp = "7:15 PM")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMessageBinding.inflate(inflater, container, false)

        return binding.root


    }
}