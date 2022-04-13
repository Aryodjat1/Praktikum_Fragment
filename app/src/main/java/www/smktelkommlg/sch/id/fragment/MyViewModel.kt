package www.smktelkommlg.sch.id.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.reflect.Array.get

class MyViewModel : ViewModel() {

    private val mName = MutableLiveData<String>()
    private val mKelas = MutableLiveData<String>()
    private val mAbsen = MutableLiveData<String>()
    private val mAlamat = MutableLiveData<String>()

    val name: LiveData<String>
        get() = mName
    fun setName(name: String) {
        mName.value = name
    }
    val kelas: LiveData<String>
        get() = mKelas
    fun setKelas(kelas: String) {
        mKelas.value = kelas
    }
    val absen: LiveData<String>
        get() = mAbsen
    fun setAbsen(absen: String) {
        mAbsen.value = absen
    }
    val alamat: LiveData<String>
        get() = mAlamat
    fun setAlamat(alamat: String) {
        mAlamat.value = alamat
    }

}