package com.projectkr.shell


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.omarea.krscript.model.PageNode
import com.projectkr.shell.R
import com.projectkr.shell.OpenPageHelper // Ensure this is the correct import
import kotlinx.android.synthetic.main.fragment_nav.*
import android.widget.Toast
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import java.io.IOException


class APP : AppCompatActivity() {
    val pageNode = PageNode("").apply {
                title = "XML"
                pageConfigSh = "/data/data/com.projectkr.shell/test.xml"
            }
            OpenPageHelper(requireActivity()).openPage(pageNode)
}