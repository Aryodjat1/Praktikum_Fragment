package www.smktelkommlg.sch.id.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class SecondFragment : Fragment() {
    private var myViewModel: MyViewModel? = null
    private var txtName: TextView? = null
    private var txtKelas: TextView? = null
    private var txtAbsen: TextView? = null
    private var txtAlamat: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myViewModel = ViewModelProviders.of(requireActivity()).get(MyViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_second,
            container, false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        txtKelas = view.findViewById(R.id.textViewClass)
        txtAbsen = view.findViewById(R.id.textViewAbsen)
        txtAlamat = view.findViewById(R.id.textViewAlamat)

        myViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })

        myViewModel!!.kelas.observe(requireActivity(),
            Observer { t -> txtKelas!!.text = t })

        myViewModel!!.absen.observe(requireActivity(),
            Observer { u -> txtAbsen!!.text = u })

        myViewModel!!.alamat.observe(requireActivity(),
            Observer { v -> txtAlamat!!.text = v })
    }

    companion object {
        fun newInstance(): SecondFragment {
            return SecondFragment()
        }
    }
}