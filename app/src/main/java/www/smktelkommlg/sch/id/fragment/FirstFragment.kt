package www.smktelkommlg.sch.id.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.textfield.TextInputEditText


class FirstFragment : Fragment() {
    private var myViewModel: MyViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myViewModel =
            ViewModelProviders.of(requireActivity()).get(MyViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_first,
            container, false
        )
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        val nameEditText = view.findViewById<TextInputEditText>(R.id.textInputTextName)
        val kelasEditText = view.findViewById<TextInputEditText>(R.id.textInputTextClass)
        val absenEditText = view.findViewById<TextInputEditText>(R.id.textInputTextAbsen)
        val alamatEditText = view.findViewById<TextInputEditText>(R.id.textInputTextAlamat)
        nameEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int
                ) {
                }

                override fun onTextChanged(
                    charSequence: CharSequence,
                    i: Int, i1: Int, i2: Int
                ) {
                    myViewModel!!.setName(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {}
            })

        kelasEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int
                ) {
                }

                override fun onTextChanged(
                    charSequence: CharSequence,
                    i: Int, i1: Int, i2: Int
                ) {
                    myViewModel!!.setKelas(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {}
            })

        absenEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int
                ) {
                }

                override fun onTextChanged(
                    charSequence: CharSequence,
                    i: Int, i1: Int, i2: Int
                ) {
                    myViewModel!!.setAbsen(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {}
            })

        alamatEditText.addTextChangedListener(
            object : TextWatcher {
                override fun beforeTextChanged(
                    charSequence: CharSequence, i: Int, i1: Int, i2: Int
                ) {
                }

                override fun onTextChanged(
                    charSequence: CharSequence,
                    i: Int, i1: Int, i2: Int
                ) {
                    myViewModel!!.setAlamat(charSequence.toString())
                }

                override fun afterTextChanged(editable: Editable) {}
            })
    }

    companion object {
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }
}